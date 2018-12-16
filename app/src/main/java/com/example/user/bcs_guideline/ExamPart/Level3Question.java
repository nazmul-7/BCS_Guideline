package com.example.user.bcs_guideline.ExamPart;

public class Level3Question {
    public String questions[] = {
            " To stay healthy, we must plan to have a balanced __.?",
            " We must keep our fingers __ that the weather will stay fine for the picnic tomorrow.",
            " কাজী নজরুল ইসলামের উপন্যাস কোনটি?",
            "পিতা ও মাতার বয়সের গড় ৪৫ বছর। আবার পিতা,মাতা ও এক পুত্রের বয়সের গড় ৩৬ বছর। পুত্রের বয়স- ",
            "যদি p একটি মৌলিক সংখ্যা হয় তবে-",
            " বস্তুর ওজন কোথায় সবচেয়ে বেশি?",
            "জীবাশ্ম জ্বালানি দহনের ফলে বায়ুমণ্ডলে যে গ্রীন হাউজ গ্যাসের পরিমাণ সবচেয়ে বেশি বৃদ্ধি পাচ্ছে-",
            "কাঁচ তৈরির প্রধান কাঁচামাল হলো-",
            "উড়োজাহাজের গতি নির্ণায়ক যন্ত্র-",
            "কম্পিউটার সফটওয়্যার জগতে নামকরা প্রতিষ্ঠান কোনটি?",
            "He divided the money - the two children",
            "A person who write about his own life writers-.",
            "দৃশ্যমান বর্ণালীর ক্ষুদ্রতম তরঙ্গ দৈর্ঘ্য কোন রং এর আলোর?",
            "কিসের সাহায্যে সমুদ্রের গভীরতা নির্ণয় করা হয়?",
            "সাধারন বৈদ্যুতিক বাল্বের ভিতরে কি গ্যাস সাধারণত ব্যবহার করা হয়?",
            "The walls of our house have been painted ___green?",
            "মৌলিক শব্দ কোনটি?",
            "কোনটি বিশেষণ বাক্যের শব্দ?",
            "বাংলা লিপির উৎস কী??",
            "বাংলাদেশের প্রধান জাহাজ নির্মান কারখানা কোথায় অবস্থিত?",
            "ক্যাটালন কোন দেশের ভাষা?"


    };

    public String choices[][] = {
            {"figure", "food", " diet", " outlook"},
            {"raised", "pointed", "lifte", "crossed"},
            {"মৃত্যুক্ষুধা", "আলেয়া", "ঝিলিমিলি", "মধুবালা"},
            {"৯বছর", "১৪বছর", "১৫ বছর", "১৮ বছর"},
            {"একটি স্বাভাবিক সংখ্যা","একটিপূর্ণসংখ্যা","একটি মূলদ সংখ্যা","একটি অমূলদ সংখ্যা"},
            {"খনিরভিতর","পাহাড়ের উপর","মেরুঅঞ্চলে","বিষুব অঞ্চলে"},
            {"জ্বালানিবাস্প","ক্লোরফ্লোর কার্বন","কার্বনডাই অক্সাইড","মিথেন"},
            {"শাজিমাটি","চুনাপাথর","জিপসাম","বালি"},
            {"ক্রনোমিটার","ট্যাকোমিটার","হাইগ্রোমিটার","ওডোমিটার"},
            {"অলিভেট","আইবিএম","এ্যাপেল ম্যাকিনটশ","মাইক্রোসফট"},
            {"over","in between","among","between"},
            {"a biography","a diary","a chronicle","an autobiography"},
            {"লাল","সবুজ","নীল","বেগুনি"},
            {"প্রতিফলন","প্রতিধ্বনি","প্রতিসরণ","প্রতিসরাঙ্ক"},
            {"নাইট্রোজেন","হিলিয়াম","নিয়ন","অক্সিজেন"},
            {"by","in","with","no preposition"},
            {"গোলাপ","শীতল","নেয়ে","গৌরব"},
            {"জীবন","জীবনী","জীবিকা","জীবাণু"},
            {"সংস্কৃত লিপি","চীনা লিপি","আরবি লিপি","ব্রাহ্মী লিপি"},
            {"নারায়ণগঞ্জ","কক্সবাজার","চট্টগ্রাম","খুলনা"},
            {"স্পেন","বলজিয়াম","নাইজেরিয়া","মঙ্গোলিয়া"}

    };

    public String correctAnswer[] = {
            " diet",
            "crossed",
            "মৃত্যুক্ষুধা",
            "১৮ বছর",
            "একটি অমূলদ সংখ্যা",
            "মেরুঅঞ্চলে",
            "কার্বনডাই অক্সাইড",
            "বালি",
            "ট্যাকোমিটার",
            "মাইক্রোসফট",
            "between",
            "an autobiography",
            "বেগুনি",
            "প্রতিধ্বনি",
            "নাইট্রোজেন",
            "no preposition",
            "গোলাপ",
            "জীবনী",
            "ব্রাহ্মী লিপি",
            "খুলনা",
            "স্পেন",

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

