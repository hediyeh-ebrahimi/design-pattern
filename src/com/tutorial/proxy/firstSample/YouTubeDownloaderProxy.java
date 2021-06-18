package com.tutorial.proxy.firstSample;

import abs.ThirdPartyYouTubeLib;
import impl.ThirdPartyYouTubeClass;
import model.Video;

import java.util.HashMap;

//implement from interface , use service
public class YouTubeDownloaderProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeClass youTubeService;//service
    private HashMap<String,Video> cachePopular = new HashMap<>();
    private HashMap<String,Video> cacheAll = new HashMap<>();

    public YouTubeDownloaderProxy() {
        this.youTubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = youTubeService.popularVideos();
        }else{
            System.out.println("Retrieved list from cache");
        }
        return this.cachePopular;
    }

    @Override
    public Video getVideo(String s) {
        Video video = this.cacheAll.get(s);
        if(video == null){
             video = this.youTubeService.getVideo(s);
            this.cacheAll.put(video.getId(),video);
        }else{
            System.out.println("Retrieved list from cache");
        }
        return video;
    }

    public void reset(){
        this.cacheAll = new HashMap<>();
        this.cachePopular = new HashMap<>();
    }
}
