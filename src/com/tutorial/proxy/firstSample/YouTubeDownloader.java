package com.tutorial.proxy.firstSample;

import abs.ThirdPartyYouTubeLib;
import model.Video;

import java.util.HashMap;


public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api; //interface

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }


    public void renderVideoPage(String videoId) {
        Video video = this.api.getVideo(videoId);
        System.out.println("\n------------------------");
        System.out.println("Video page (imaging fancy html)");
        System.out.println("Id: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-----------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String,Video> list = api.popularVideos();
        System.out.println("\n-----------------------");
        System.out.println("Most popular videos on YouTube (imaging fancy html)");
        for ( Video video:list.values()){
            System.out.println("Id: "+video.getId()
            +"/ Title: "+video.getTitle());
        }
        System.out.println("-----------------------\n");
    }
}
