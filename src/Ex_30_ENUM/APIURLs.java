package Ex_30_ENUM;

public enum APIURLs {
    vwo("https://app.vwo.com") ,
    katalon("https://katalon.com") ,
    goolge("https://google.com");


    private String url;

    APIURLs(String url){
        this.url = url;

    }


    String getUrl(){
        return this.url;
    }
}
