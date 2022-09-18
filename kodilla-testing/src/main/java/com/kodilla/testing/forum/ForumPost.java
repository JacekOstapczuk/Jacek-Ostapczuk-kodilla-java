package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {

    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!Objects.equals(postBody, forumPost.postBody)) return false;
        return Objects.equals(author, forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postBody != null ? postBody.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}