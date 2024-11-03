package com.teamProject.tripPlan.service;

import com.teamProject.tripPlan.dto.KakaoApiResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class KakaoKeywordSearchService {
    @Value("${kakao.rest.api.key}")
    private String kakaoRestApiKey;

    private final String KAKAO_SEARCH_URL = "https://dapi.kakao.com/v2/local/search/keyword.json";

    private final RestTemplate restTemplate;

    public KakaoKeywordSearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public KakaoApiResponseDTO searchPlacesByKeyword(String keyword) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(KAKAO_SEARCH_URL)
                .queryParam("query", keyword)
                .queryParam("size", 10); // 검색 결과 개수를 10개로 제한
        URI uri = uriBuilder.build().encode().toUri();
        // 헤더 작성
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "KakaoAK " + kakaoRestApiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // 카카오 API 호출
        ResponseEntity<KakaoApiResponseDTO> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                KakaoApiResponseDTO.class
        );
        return response.getBody();
    }
}
