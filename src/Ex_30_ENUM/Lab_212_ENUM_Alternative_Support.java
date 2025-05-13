package Ex_30_ENUM;

public class Lab_212_ENUM_Alternative_Support {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("--");
        System.out.println(Colors.Red.getHexcode());
        System.out.println(Colors.GREEN.getHexcode());

        System.out.println("--");
        System.out.println(APIURLs.goolge.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());




    }

}
//Alternative use to support urls
