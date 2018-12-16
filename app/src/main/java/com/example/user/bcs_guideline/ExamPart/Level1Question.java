package com.example.user.bcs_guideline.ExamPart;

public class Level1Question {


    public String[] questions = {
            "সঞ্চয়িতা- কোন কবির কাব্য সংকলন?",
            "সিলেট কোন নদীর তীরে অবস্থিত?",
            "একটি দ্রব্য ৩৮০ টাকায় বিক্রয় করায় ২০ টাকা ক্ষতি হল। ক্ষতির শতকরা হার কত? ",
            "কোন কোন স্বাভাবিক সংখ্যা দ্বারা ৩৪৬কে ভাগ করলে প্রতি ক্ষেত্রে ৩১ অবশিষ্ট থাকে? ",
            "উড়োজাহাজের গতি নির্ণায়ক যন্ত্র-?",
            "রূপসী বাংলার কবি-",
            "অগ্ন্যাশয় থেকে নির্গত চিনির বিপাক নিয়ন্ত্রণকারী হরমোন কোনটি?",
            "মানবদেহের রক্তচাপ নির্ণায়ক যন্ত্র?",
            "ক্রিয়াপদের মূল অংশকে বলে---?"

    };

    public String choices[][] = {
            {"রবীন্দ্রনাথ ঠাকুর", "সত্যেন্দ্রনাথ দত্ত", " কাজী নজরুল ইসলাম", " জসীমউদদীন."},
            {"আড়িয়াল খাঁ", "সুরমা", "চন্দনা", "রূপসা"},
            {"৪%", "৬%", "৫%", "৭%"},
            {"৩৫, ৪৫, ৬৩, ১০৫, ৩১৫", "৩৫, ৪০, ৬৫, ১১০, ৩১৫", "৩৫, ৪৫, ৭০, ১০৫, ৩১৫", "৩৫, ৪৫, ৬৩, ১১০, ৩১৫"},
            {"ক্রনোমিটার","ট্যাকোমিটার","হাইগ্রোমিটার","ওডোমিটার"},
            {"জসীমউদ্দীন","জীবনানন্দ দাশ","কালিদাস রায়","সত্যেন্দ্রনাথ দত্ত"},
            {"পেনিসিলিন","ইনসুলিন","পোলিক এসিড","এমিনো এসিড"},
            {"স্ফিগমোম্যানোমিটার","স্টেথস্কোপ","কার্ডিওগ্রাফ","ইস্কোকার্ডিওগ্রাফ"},
            {"বিভক্তি","ধাতু","প্রত্যয়","কৃৎ"}
    };

    public String correctAnswer[] = {
            "রবীন্দ্রনাথ ঠাকুর",
            "সুরমা",
            "৫%",
            "৩৫, ৪৫, ৬৩, ১০৫, ৩১৫",
            "ট্যাকোমিটার",
            "জীবনানন্দ দাশ",
            "ইনসুলিন",
            "স্ফিগমোম্যানোমিটার",
            "ধাতু"
    };
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

}

