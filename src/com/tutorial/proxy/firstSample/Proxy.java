package com.tutorial.proxy.firstSample;

import impl.ThirdPartyYouTubeClass;

/*
 * structural pattern
 * this pattern prepare substitute object
 * proxy controls access to original access and provid function before or after the request to original object
 * we use this pattern because of other framework , libs
 * */
public class Proxy {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader cacheDownloader = new YouTubeDownloader(new YouTubeDownloaderProxy());
        long naive = test(naiveDownloader);
        long cache = test(cacheDownloader);

        printDiff(naive,cache);

    }

    private static long test(YouTubeDownloader youTubeDownloader) {
        long startTime = System.currentTimeMillis();
        youTubeDownloader.renderPopularVideos();
        youTubeDownloader.renderVideoPage("a1");
        youTubeDownloader.renderPopularVideos();
        youTubeDownloader.renderVideoPage("test");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        System.out.println("estimatedTime: " + estimatedTime);
        return estimatedTime;
    }

    private static void printDiff(long naive, long cache) {
        System.out.println("Time saved caching proxy: " + (naive - cache) + "ms");

    }
}
