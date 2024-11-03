package com.teamProject.tripPlan.dao;

import com.teamProject.tripPlan.entity.Comment;
import com.teamProject.tripPlan.entity.Post;
import com.teamProject.tripPlan.entity.Suggestion;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Transactional
public class CommentDAO {

    @Autowired
    EntityManager em;

    public void insertComment(Long postId, Comment comment, String nickname) {
        Post post = em.find(Post.class, postId);
        comment.setPost(post);
        comment.setCommentNickname(nickname); // 현재 로그인되어있는 사람의 닉네임으로 변경
        post.getComments().add(comment);
        em.persist(post);
    }

    public Long deleteComment(Long commentId) {
        Comment comment = em.find(Comment.class, commentId);
        em.remove(comment);
        return comment.getPost().getPostId();
    }

    public Comment findByCommentId(Long commentId) {
        return em.find(Comment.class, commentId);
    }


    public void updateComment(Comment comment) {
        Comment newComment = em.find(Comment.class, comment.getCommentId());
        newComment.setCommentContent(comment.getCommentContent());
    }

    public List<Comment> findAllComment(Long id) {
        String sql = "SELECT c FROM Comment c JOIN c.post p WHERE p.postId = :postId ORDER BY c.commentId DESC";
        List<Comment> commentLists = em.createQuery(sql, Comment.class).setParameter("postId", id).getResultList();
        return commentLists;
    }
}
