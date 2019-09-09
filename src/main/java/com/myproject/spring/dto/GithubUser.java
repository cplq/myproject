package com.myproject.spring.dto;/**
 * @Author: ChenPeng
 * @Date: 2019-09-09 11:22
 * @Version 1.0
 */

/**
 * @program: spring
 * @description:
 * @author: ChenPeng
 * @create: 2019-09-09 11:22
 **/
public class GithubUser {
    private String name;
    private long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
