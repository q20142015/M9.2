public class Main {
    public static void main(String[] args) {
        String text="My name is Dima. I am a student of the second year of study. I study at the university. My hobby is music. When I have free time I usually go to the biggest music shop in my town and buy CDs with my favourite music. I have a big collection of CDs at home, but I can not resist the temptation of buying a new CD. That what I like to buy most of all.\n" +
                "\n" +
                "But when it comes to buying new clothes, I am really at a loss. I do not follow fashion very much. That's why I almost always have problems with finding the clothes that suit me. When I need new clothes, I usually go to a shop with my fried or relatives. Some of them are fond of fashion and may advise me the clothes that are becoming and suit me best.\n" +
                "\n" +
                "As for food, I like to go to a supermarket and buy there everything my family needs. I often go shopping with my mother. She buys healthy food for our family fruits and vegetables, fish, honey, cheese and turkey. As for me, I buy what I most of all: biscuits, candied fruit jelly, shrimps and sweets. I buy them not only for myself but also for the whole family. That's what I like shopping for. I can buy things that I like and it raises my mood.";
        String regex = "[^a-zA-Z']+";
        String[] textm=text.split(regex);
        String outStr="";
        for (int i=0;i<textm.length;i++)
        {
            outStr+=textm[i]+"\n";
        }
        System.out.println(outStr);
    }
}
