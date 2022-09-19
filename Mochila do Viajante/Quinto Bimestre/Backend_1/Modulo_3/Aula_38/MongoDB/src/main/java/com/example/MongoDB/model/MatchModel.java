package com.example.MongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "matches")
public class MatchModel {

    @Id
    private Integer id;
    private String final_result;
    private  StatusModel status;
    @Field(name = "local_team")
    private TeamModel localTeam;
    @Field(name = "visitor_team")
    private TeamModel visitorTeam;

    public MatchModel(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFinal_result() {
        return final_result;
    }

    public void setFinal_result(String final_result) {
        this.final_result = final_result;
    }

    public StatusModel getStatus() {
        return status;
    }

    public void setStatus(StatusModel status) {
        this.status = status;
    }

    public TeamModel getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(TeamModel localTeam) {
        this.localTeam = localTeam;
    }

    public TeamModel getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(TeamModel visitorTeam) {
        this.visitorTeam = visitorTeam;
    }
}
