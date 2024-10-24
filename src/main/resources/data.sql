INSERT INTO keyword (keyword) VALUES ('숙박');
INSERT INTO keyword (keyword) VALUES ('맛집');
INSERT INTO keyword (keyword) VALUES ('자연');
INSERT INTO keyword (keyword) VALUES ('역사');
INSERT INTO keyword (keyword) VALUES ('체험');
INSERT INTO keyword (keyword) VALUES ('쇼핑');
INSERT INTO keyword (keyword) VALUES ('문화');

INSERT INTO area (area) VALUES ('서울특별시');
INSERT INTO area (area) VALUES ('부산광역시');
INSERT INTO area (area) VALUES ('대구광역시');
INSERT INTO area (area) VALUES ('인천광역시');
INSERT INTO area (area) VALUES ('광주광역시');
INSERT INTO area (area) VALUES ('대전광역시');
INSERT INTO area (area) VALUES ('울산광역시');
INSERT INTO area (area) VALUES ('세종특별자치시');
INSERT INTO area (area) VALUES ('경기도');
INSERT INTO area (area) VALUES ('강원특별자치도');
INSERT INTO area (area) VALUES ('충청북도');
INSERT INTO area (area) VALUES ('충청남도');
INSERT INTO area (area) VALUES ('전북특별자치도');
INSERT INTO area (area) VALUES ('전라남도');
INSERT INTO area (area) VALUES ('경상북도');
INSERT INTO area (area) VALUES ('경상남도');
INSERT INTO area (area) VALUES ('제주특별자치도');

INSERT INTO users (user_name, user_nickname, user_email, user_id, user_password) VALUES ('frog', 'froggy', 'frog@naver.com', 'froggg', 'frogfrog');
INSERT INTO users (user_name, user_nickname, user_email, user_id, user_password) VALUES ('ant', 'antty', 'ant@naver.com', 'anttt', 'antant');

INSERT INTO post (likes, post_date, user_no, post_title, post_content) VALUES (100, '2024-07-23', 1, '부산 조아', '부산 개조음');
INSERT INTO post (likes, post_date, user_no, post_title, post_content) VALUES (159, '2024-08-11', 2, '여수 조아', '여수 개조음');

INSERT INTO travel (end_date, start_date, user_id, keyword, place) VALUES ('2024-07-21', '2024-07-19', 1, '호캉스', '부산')
