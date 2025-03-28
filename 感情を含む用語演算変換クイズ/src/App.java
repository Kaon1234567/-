
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class App implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement the method logic here
        /*JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();*/
        if(e.getSource()==this.next){
            do {
                this.quizIndex = random.nextInt(QUIZ.length);
            } while ((this.clearcount+this.count)>=3);
            this.quiz = QUIZ[this.quizIndex];
            this.hints = HINTS[this.quizIndex];
        this.attempts = 0;
        //Contains();
        Quizput();
        }
        else if(e.getSource()==this.end){
            Mpanel.add(this.lbel, BorderLayout.CENTER);
            System.exit(0);
        }
        else if(e.getSource()==this.answerBtn0){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn1){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn2){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn3){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn4){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn5){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
        else if(e.getSource()==this.answerBtn6){
            JButton answerbutton = (JButton) e.getSource();
    String ButtonText = answerbutton.getText();
    if (ButtonText.equals(this.CorrectAnswer)) {
        Goodjuage();
        answerBtn0.setEnabled(true);
    }else {answerBtn0.setEnabled(false);
        Badjuage();
    }
        }
    }

    //private static final Map<String, String> EMOTIONS_MAP = new LinkedHashMap<>();
    private static final Map<Integer, String> NUMBERS_MAP = new LinkedHashMap<>();
    private static final String[] EMOTIONS = {//用語配列
        "愛憎", "楽観", "病的状態", "積極性", "誇り", "冷笑", "悲観", "軽蔑",
        "嫉妬", "憤慨", "自責", "不信", "恥", "失望", "絶望", "感傷",
        "畏敬", "好奇心", "歓喜", "服従", "罪悪感", "不安", "愛", "希望",
        "優位", "楽しい", "怒り", "悲しみ", "悲痛", "喜び", "恐れ", "驚き",
        "嫌悪", "期待", "信頼", "恍惚", "警戒", "激怒", "憎悪", "驚嘆",
        "恐怖", "感嘆", "平穏", "興味", "煩さ", "憂い", "退屈", "動揺",
        "心配", "容認", "傲慢", "憤怒", "怠惰", "強欲", "暴食", "色欲",
        "慈悲", "忍耐", "勤勉", "救恤", "節制", "謙譲", "純潔", "叡智",
        "悪意", "闘争", "殺意", "絶滅", "破滅", "滅亡", "魔法", "キラメンタル",
        "ガッチャ！", "忍タリティ", "ビルド", "ラブ＆ピース", "ブレイブ", "イマジネーション", "モカってる", "ツグってる",
        "ノアってる", "むにってる", "ルミナってる", "エモい", "可愛い", "尊い", "記憶", "正義",
        "絶対悪", "バンド", "DJ", "システム", "技能", "技術", "神聖術", "歌唱",
        "科学", "音楽", "宇宙", "神代"
    };
    /*private static final String[] NUMBERS = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
        "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
        "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59",
        "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79",
        "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"
    };*/
    private static final Integer[] Numbers = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100
    };
    private static final String[] QUIZ = {//問題配列
        "愛と憎しみを合わせたものを何という？", "期待と喜びを合わせたものを何という？", "嫌悪と喜びを合わせたものを何という？", "怒りと期待を合わせたものを何という？", "怒りと喜びを合わせたものを何という？", "嫌悪と期待を合わせたものを何という？", "悲しみと期待を合わせたものを何という？", "嫌悪と怒りを合わせたものを何という？", "悲しみと怒りを合わせたものを何という？", "驚きと怒りを合わせたものを何という？",
        "悲しみと嫌悪を合わせたものを何という？", "驚きと嫌悪を合わせたものを何という？", "恐れと嫌悪を合わせたものを何という？", "驚きと悲しみを合わせたものを何という？", "恐れと悲しみを合わせたものを何という？", "信頼と悲しみを合わせたものを何という？", "恐れと驚きを合わせたものを何という？", "信頼と驚きを合わせたものを何という？", "喜びと驚きを合わせたものを何という？", "信頼と恐れを合わせたものを何という？",
        "喜びと恐れを合わせたものを何という？", "期待と恐れを合わせたものを何という？", "喜びと信頼を合わせたものを何という？", "期待と信頼を合わせたものを何という？", "怒りと信頼を合わせたものを何という？", "喜怒哀楽から哀しいと哀しいと怒りを外したものを何という？", "嬉笑怒罵から嬉しいと笑うと罵るを外したものを何という？", "哀哀父母から哀しい一つと父と母を外したものを何という？", "愛別離苦から別れる離れると愛するを外したものを何という？", "狂喜乱舞から狂うと乱れると舞うを外したものを何という？",
        "恐恐謹言から恐れ一つと謹言を外したものを何という？", "驚心動魄から心と動くと魄を外したものを何という？", "自己嫌悪から自己を外したものを何という？", "期待値から値を外したものを何という？", "信頼度成長曲線から度と成長曲線を外したものを何という？", "恍惚の人からのと人を外したものを何という？", "警戒区域から区域を外したものを何という？", "激怒症候群から症候群を外したものを何という？", "憎悪の念からのと念を外したものを何という？", "驚嘆に値するからにと値するを外したものを何という？",
        "恐怖しろ！からしろと！を外したものを何という？", "感嘆符から符を外したものを何という？", "平穏無事から無事を外したものを何という？", "興味津津から津津を外したものを何という？", "煩雑世界から雑と世界を外したものを何という？", "憂鬱な未来から鬱なと未来を外したものを何という？", "退屈心理から心理を外したものを何という？", "動揺性歩行から性と歩行を外したものを何という？", "心配事から事を外したものを何という？", "容認発音から発音外したものを何という？",
        "笑われるとコンプレックスから生み出されるものは何？", "理性消失と本能的殺戮から生み出されるものは何？", "周囲大幅消費と自己効率から生み出されるものは何？", "殺害相手からランダムに一部略奪と満たされない欲望から生み出されるものは何？", "あらゆるものを対象に食すことが可能と永久空腹から生み出されるものは何？", "相手に「催眠」「魅了」「洗脳」の状態異常を付与と激しい嫌悪感から生み出されるものは何？", "「死者蘇生と禁忌から生み出され、自己を省くものは何」？", "「死亡回避と防御・抵抗の能力上昇と耐性系熟練度補正から生み出され、我慢を省くものは何」？", "「魂移す侵食乗っ取りと半分不死から生み出され、他者の意思を省くものは何」？", "自身を中心に自己及び味方へ体力超速回復と寄付から生み出され、ストックを省くものは何？",
        "「前世の記憶保持状態での転生可能と実質不死から生み出され、不正を省くものは何」？", "「魂を消費して神と同等の力を得ると対等な立場から生み出され、不快感を省くものは何」？", "「自身の持つ神性領域を拡張すると強力な結界を展開するから生み出され、性的な関係を省くものは何？」", "「全情報閲覧とマッピングと追跡と魔道の極みと星魔から生み出され、拒否を省くものは何」？", "「深い悲しみと憎悪から至り、一つを除いてあらゆる感情が鎮静されるものは何」？", "「殺し合う儀式と秘めた戦求本能から至り、全く同じものでは話にならないものは何」？", "「愛も欲も自分の中と気付けない存在が謳うから至り、心の中を探すものは何」？", "「個体の減少と星から存在しなくなるから至り、バランスが破損するものは何」？", "死亡するフラグと成長するスピード速遅から至り、創造の先にあるものは何？", "破局的な被害を受けると失い陥った運命から至り、回避したいと思うものは何？",
        "「それは聖なる力、それは未知への冒険、そしてそれは勇気の証」を変換したものは何？", "輝く精神を変換したものは何？", "自分だけの何かを変換したものは何？", "忍者に対して抱く各々の心の在り方や精神の持ち方と言った精神力を変換したものは何？", "「創る、形成する」を変換したものは何？", "愛と平和を変換したものは何？", "『「勇気(brave)」だけでなく滅びた小惑星にはなかったもので、共に燃え上がり、絶望を乗り越える人間の魂とされる心の力』を変換したものは何？", "想像力を変換したものは何？", "マイペースに行くを変換したものは何？", "頑張っているを変換したものは何？", "「素晴らしい、最高を変換したものは何」？",
        "可愛いものに目がない様を変換したものは何？", "自分を認めてくれる相手には甘えていくが、そうでない相手にはガードが堅い様を変換したものは何？", "感情を持つAI（機械族）が感情を持たないAI（機械族）のような行動を取る様を変換したものは何？", "何とも言い表せない素敵な気持ちを変換したものは何？", "「小さいもの、弱いものなどに心惹かれる気持ちを抱く様を変換したものは何」？", "「時間が重なってできたもの、特定の事象を変換したものは何」？", "「存在の数だけ存在する、理想の具現化、偽善、正しい道理を変換したものは何」？", "名も社会も文明も全て無に還すを変換したものは何？", "運命共同体を変換したものは何？",
        "『「ダンス・クラブやディスコでレコードを選択し、プレーする人」、存在と音楽を繋ぐのを変換したものは何』？", "多数の要素が集ま手まとまりを持った組織や体系のことを変換したものは何？", "非常に稀有な「才能」たる転職に関連した能力を変換したものは何？", "「攻撃・防御の正確さ、精密さ」を変換したものは何？", "「8種の系統を持ち、神聖力を消費する」を変換したものは何？", "歌を歌う事を変換したものは何？", "分からないことにルールを探す地道な努力を変換したものは何？", "「音による芸術、器楽と声楽がある、人間に秘められた力を開放するものを変換したものは何」？", "『時空全体、前後左右上下に広がる空間と過去から未来に伸びる時間をひっくるめたもの、「共感覚によって曲が変わる度に会場全体の音、人の気持ちの色が変わる」を変換したものは何』？", "「星の理を捻じ曲げる理法術と呼ばれる魔法の名を示す、下界に神の居る時代を変換したものは何」？"
    };
    private static final String ENGLISH[] = {//英語解配列
        "Love And Hate", "Optimism " + "(=Anticipation " + "+Joy)", "Morbidness " + "(=Disgust " + "+Joy)", "Aggressiveness " + "(=Anger " + "+Anticipation)", "Pride " + "(=Anger " + "+Joy)", "Cynicism " + "(=Disgust " + "+Anticipation)", "Pessimism " + "(=Sadness " + "+Anticipation)", "Contempt " + "(=Disgust " + "+Anger)", "Envy " + "(=Sadness " + "+Anger)", "Outrage " + "(=Surprise " + "+Anger)",
        "Remorse " + "(=Sadness " + "+Disgust)", "Unbelief " + "(=Surprise " + "+Disgust)", "Shame " + "(=Fear " + "+Disgust)", "Disappointment " + "(=Surprise " + "+Sadness)", "Despair " + "(=Fear " + "+Sadness)", "Sentimentality " + "(=Trust " + "+Sadness)", "Awe " + "(=Fear " + "+Surprise)", "Curiosity " + "(=Trust " + "+Surprise)", "Delight " + "(=Joy " + "+Surprise)", "Submission " + "(=Trust " + "+Fear)",
        "Guilt " + "(=Joy " + "+Fear)", "Anxiety " + "(=Anticipation " + "+Fear)", "Love " + "(=Joy " + "+Trust)", "Hope " + "(=Anticipation " + "+Trust)", "Dominance " + "(=Anger " + "+Trust)", "Enjoy " + "(=joy, anger, sadness, Enjoy " + "-joy " + "-anger " + "-sadness)", "Anger " + "(=Happy laughing angry cursing " + "-happy " + "-laugh " + "-curse)", "Grief " + "(=separation pain " + "-Love " + "-break up " + "-Leave)", "Joy " + "(=Crazy dance " + "-go crazy " + "-be disturbed " + "-dance)",
        "Fear " + "(=I apologize for the inconvenience " + "-one fear " + "-Greetings)", "Surprise " + "(=Shocking heart " + "-heart " + "-move " + "-spirit)", "Disgust " + "(=self hate " + "-self)", "Anticipation " + "(=Expected value " + "-value)", "Trust " + "(=Confidence growth curve " + "-degree " + "-growth curve)", "Ecstasy " + "(=ecstatic person " + "-of " + "-person)", "Vigilance " + "(=restricted area " + "-area)", "Rage " + "(=rage syndrome " + "-syndrome)", "Loathing " + "(=thoughts of hatred " + "-of " + "-Thought)", "Amazement " + "(=amazing " + "-to " + "-worthy)",
        "Terror " + "(=Be afraid! " + "-do " + "-!)", "Admiration " + "(=Exclamation point " + "-sign)", "Serenity " + "(=Peaceful and safe " + "-safely)", "Interest " + "(=Interesting " + "-all over)", "Annoyance " + "(=complicated world " + "-rough " + "-world)", "Pensiveness " + "(=gloomy future " + "-Depressed " + "-future)", "Boredom " + "(=boredom psychology " + "-psychology)", "Distraction " + "(=agitated gait " + "-gender " + "-walking)", "Apprehension " + "(=Anxiety " + "-case)", "Acceptance " + "(acceptable pronunciation " + "-pronunciation)",
        "Arrogance " + "(=be laughed at* " + "Complex)", "Wrath " + "(=Reason disappears* " + "Instinctive massacre)", "Lazy " + "(=The neighborhood large consumption* " + "Self efficiency)", "Greed " + "(=I plunder the killing partner of it partly at random* " + "The greed that is not satisfied)", "Gluttony " + "(=I can eat it targeting at every thing* " + "Eternity hunger)", "Lust " + "(=I give state abnormality of the \"hypnosis\" \"charm\" \"brainwashing\" to a partner* " + "Intense loathsomeness)", "Mercy " + "(=resurrection of the dead* " + "Taboo" + "/self)", "Patience " + "(=death avoidance* " + "Defense/resistance ability increase and resistance proficiency correction* " + "Resistance proficiency correction " + "/Patience)", "Diligence " + "(=Erosion takeover to move the soul* " + "half immortal " + "/the will of others)", "Relief " + "(=Super fast recovery of physical strength to self and allies* " + "donation " + "/stock)",
        "Temperance " + "(=Reincarnation with memory of previous life retained* " + "Practically immortal " + "/fraud)", "Humility " + "(=Consume your soul to gain power equal to that of a god* " + "equal position " + "/Discomfort)", "Purity " + "(=Expand your own divine realm* " + "develop a powerful barrier " + "/sexual relationship)", "Wisdom " + "(=View all information* " + "mapping* " + "tracking* " + "The height of magic* " + "Star demon " + "/rejection)", "Malice " + "(=deep sorrow* " + "hatred " + "%It is every feeling except one)", "Struggle " + "(=The ceremony that it spoils* " + "Hidden fighting instinct " + "%It doesn't matter if it's exactly the same)", "Intention to kill " + "(=As for the love and the desire among oneself* " + "Existence not to be able to notice declares it " + "→I can look for it in a heart)", "Extinction " + "Decrease in individuals* " + "cease to exist from the stars " + "→balance is damaged", "Catastrophe " + "(=flag to die* " + "growing fast and slow " + "→beyond creation", "Destruction " + "(=suffer catastrophic damage* " + "The fate I lost " + "→want to avoid",
        "Magic " + "(=It's holy power, it's an adventure into the unknown, and it's a proof of courage.)", "Chiramental " + "(=shining spirit)", "Gotcha " + "(=something just for me)", "Shinobi Tality " + "(=Mental strength, such as the way each person's heart and spirit is held toward ninjas)", "Build " + "(=Create, form)", "Love and peace " + "(=love & peace)", "Brave " + "(=``Not only 'brave', but also the power of the heart that was not present on the destroyed asteroid, and is said to be the human spirit that burns together and overcomes despair.'')", "Imagination " + "(=imagination)", "It's mocha " + "(=go at your own pace)", "I'm confused " + "(=doing my best)",
        "Noah is here " + "(=It's like you don't have an eye for cute things)", "be disgusted with " + "(=So that I behave like a baby to a partner detecting oneself, but guard is firm for the partner who is not so)", "luminous " + "(=The way an AI (machine people) with emotions behaves like an AI (machine people) without emotions.)", "Emotional " + "(=What an indescribably wonderful feeling!)", "Cute " + "(=Feeling attracted to small and weak things)", "precious " + "(=wonderful, the best)", "Memory " + "(=Something created by the overlap of time, a specific event)", "justice " + "(=embodiment of the ideal,hypocrisy,correct reason, a righteous principle that exists as many as there are)", "absolute evil " + "(=Names, society, and civilization will all be reduced to nothing.)", "Band " + "(=Common destiny)",
        "DJ " + "(=``The person who selects and plays records at dance clubs and discos'', the person who connects existence and music.)", "System " + "(=An organization or system in which many elements come together in a cohesive manner.)", "Skill " + "(=Ability related to changing jobs as a very rare “talent”)", "Technology " + "(=Accuracy and precision of attack and defense)", "Sacred art " + "(=It has 8 different strains and consumes divine power.)", "Singing " + "(=singing a song)", "Science " + "(=Steady efforts to find rules for things we don't understand)", "Music " + "(=Art by sound, instrumental music and vocal music, something that releases the power hidden in humans.)", "Universe " + "(=The entire space and time, a space that extends forward, backward, left, right, up and down, and time that extends from the past to the future.``Every time the song changes due to synesthesia, the sound of the entire venue and the color of people's feelings change.'')", "Age of gods " + "(=An era in which there were gods in the lower world, showing the name of the magic known as Logic that twisted the principles of the stars.)6"
    };
    private static final String HINTS[][] = {
        {"「感情に所属しており、応用感情、基本感情、強い感情、弱い感情のどれにも位置しない」", "反対の語句が並んでいる", "○○の念が入り混じる", "○○相半ばする", "特に相手に対して好悪の感情を抱くこと", "一組の存在達の間に生じる全く対照的な感情"}, {"「感情に所属しており、応用感情に位置している」", "世界を軽く考えている", "物事の先行きを良い方に考えて心配しない事", "心配するほどのことではないとして気楽に考えること", "病状は○○を許さない", "状況を○○する"}, {"「感情に所属しており、応用感情に位置している」", "矛盾している状態", "「無能感が個人を圧倒し、有益な活動へ刺激するどころか、人を落ち込ませ、成長出来ないときの劣等感」", "認知症が含まれる", "病識とは患者自身が○○○○にあると自覚する事", "過剰なストレス刺激は精神的な○○○○の原因となる"},
        {"「感情に所属しており、応用感情に位置している」", "自発的に動くこと", "物事に対して能動的に行動する姿勢", "○○○を養う", "○○○のある人", "賢明な○○○"},
        {"「感情に所属しており、応用感情に位置している」", "自信を持っている", "みずからそれを名誉とする感情", "一家の○○", "○○を傷つけられる", "○○を尊重する"},
        {"「感情に所属しており、応用感情に位置している」", "さげすみ見下した態度で見ること", "「さげすみ、みくだした態度で笑う事」", "あざわらうこと", "○○主義", "○○を浮かべる"},
        {"「感情に所属しており、応用感情に位置している」", "事態を暗い向きに見ること", "好ましい状態にならないだろうと前途を悲しんで考えること", "「人生・世界・宇宙は苦しみや悪ばかりだとする、物の見方」", "先行きに望みは無いと考えるさま", "ヒント:望みの持てないさま"},
        {"「感情に所属しており、応用感情に位置している」", "馬鹿にすること", "かろんじさげすむこと", "「いやしい、劣っている、つまらないなどと感じて馬鹿にすること」", "かるくみてあなどること", "見下げること"},
        {"「感情に所属しており、応用感情及び七大罪に位置している」", "「相手のスキルを強制的に使用不能（封印）することが出来るが、感情の抑制が効きにくくなってしまう」", "相手を愛する反動", "「独占欲を満たせないときに瞬時に生まれる、消しがたい感情」", "SNSでの「いいね!」の裏の感情", "「自分より優れた者を羨んだり、妬んだりすること」"},
        {"「感情に所属しており、応用感情に位置している」", "酷く腹を立てること", "けしからぬ事に対していきどおりなげくこと", "身勝手な振る舞いに○○する", "涼宮ハルヒの○○", "非常に腹を立てている様子"},
        {"「感情に所属しており、応用感情に位置している」", "自分で自分の過ちを責めること", "○○思考", "○○の念に駆られる", "○○点", "過度な○○思考は鬱の原因"},
        {"「感情に所属しており、応用感情に位置している」", "信用しない事", "信義がない事", "不実", "○○の念を抱く", "信仰心のない事"},
        {"「感情に所属しており、応用感情に位置している」", "きまり悪く思う", "はずかしく思う", "「世の人に対し面目・名誉を失う事」", "はずべき事柄をはずかしいと思う存在らしい心", "○○を忍んでお願いする"},
        {"「感情に所属しており、応用感情に位置している」", "とある都市の最高戦力の成長が想定よりも低かった", "のぞみをうしなうこと", "あてがはずれてがっかりすること", "期待や希望が外れた時の気持ちが沈むさま", "○○落胆"},
        {"「感情に所属しており、応用感情及び負の感情に位置している」", "抗う英雄が産まれる土壌を作るための世界の状況", "「ある不在の全を獲得し、或いは現存する悪を排除する可能性がまったくなくなった場合の精神状態」", "希望のない様子", "ピンチはチャンス", "望みが絶たれた状態"},
        {"「感情に所属しており、応用感情に位置している」", "ものに感じて心を痛めること", "「そう思うと、なんだか○○の情に堪えない」", "\"ヒント:「物事に感じやすく、すぐ悲しんだり同情したりする心の傾向」", "○○に浸る", "○○的"},
        {"「感情に所属しており、応用感情に位置している」", "心から服しうやまうこと", "崇高なものや偉大な人をおそれうやまうこと", "○○の念を抱く", "○○する", "○○の念に打たれる"},
        {"「感情に所属しており、応用感情に位置している」", "珍しいものや自分の知らないものに興味を持つ心", "奇なるものを好む心", "○○○旺盛", "生得的なもの", "物事を探究しようとする根源的な心"},
        {"「感情に所属しており、応用感情に位置している」", "非常に喜ぶこと", "よろこび", "○○の声", "心からの喜び", "心が滾る"},
        {"「感情に所属しており、応用感情に位置している」", "大人しくして他人の命令や意志に従う事", "絶対○○", "○○の心理", "○○する", "他に従う事"},
        {"「感情に所属しており、応用感情に位置している」", "「社会的、道徳的に非難されるべきことを犯したという意識ないしは感情」", "自身がした行為をざいあくと感じる気持ち", "○○○を抱く", "○○○を消す", "不道徳な行いに伴う恥の気持ち"},
        {"「感情に所属しており、応用感情に位置している」", "「誰もが不通に経験する神経質、心配、困惑の感情」", "幅広い精神障害などでもみられます", "○○障害", "○○症", "○○神経症"},
        {"「感情に所属しており、応用感情に位置している」", "悪い魔法使いが得られなかったもの", "「そのものの価値を認め、強く引き付けられる気持ち」", "大事なものとして慕う心", "かわいがる", "男女が思いあう"},
        {"「感情に所属しており、応用感情に位置している」", "○○の魔法使い", "未来に望みをかけること", "「こうなればよい、なってほしいと願う事」", "その事柄の内容", "望み通りになるだろうという良い見通し"},
        {"「感情に所属しており、応用感情に位置している」", "他より立ちまさった(有利な)位置や立場", "○○に立つ", "味方に○○な戦局", "○○性", "幸福○○"},
        {"気持ちよく明るい気分だ", "「感情に所属しており、基本感情、弱い感情、強い感情、応用感情のどれにも位置しない」", "戦騎", "のびのびと満ち足りた気持ちだ", "愉しい", "○○○ピクニック"},
        {"「感情に所属しており、基本感情に位置している」", "はらだち", "戦騎", "いきどおり", "原初的な感情の一つ", "○○の状態"},
        {"感情に所属しており、強い感情に位置している", "負の感情の1つ胸が締め付けられるといった身体的感覚", "戦騎", "胸が締め付けられるといった身体的感覚", "○○○に暮れる", "哀しい気持ちや心"},
        {"「感情に所属しており、強い感情に位置している」", "（見聞きして）心が痛み極めて悲しい事", "あまりに悲しくて心が痛むこと", "○○な面持ち", "○○な叫び", "悲しさを痛ましく思う事"},
        {"「感情に所属しており、基本感情に位置している」", "うれしく思う心・気持ち", "満足な思い", "戦騎", "悦び", "慶び"},
        {"「感情に所属しており、基本感情に位置している」", "おそれること", "悪いことが起こるのではないかという心配", "懸念", "畏れ", "恐怖"},
        {"「感情に所属しており、基本感情に位置している」", "動物が予期しない事象を体験した時に起こる瞬間的な感情をいう", "驚愕", "他の感情に比べて単純かつ原始的", "生理的反応と強く結びついた情動", "愕き"},
        {"「感情に所属しており、基本感情に位置している」", "憎み嫌う事", "不愉快に思う事", "不正を○○する", "○○感", "同族○○"},
        {"「感情に所属しており、基本感情に位置している」", "ある人がそれをするのを（他の人が）あてにし、心待ちに待つこと", "将来それが実現するように待ち構えること", "あることが実現するだろうと望みをかけて待ち受けること", "「何らかのことが実現するだろう、と望みつつ待つこと」", "好ましい状態の実現を心の中で待ち望んでいる様子"},
        {"「感情に所属しており、基本感情に位置している」", "頼りに出来るとして信ずること", "信じて頼りとすること", "信用して任せること", "信じて頼りにする気持ち", "○○性"},
        {"「感情に所属しており、強い感情に位置している」", "「物事に心をうばわれて、うっとりする様」", "ぼけていること", "○○として聴き入る", "○○の境地", "意識がはっきりしないさま"},
        {"「感情に所属しており、強い感情に位置している」", "「好ましくないことが起こらないように、注意し用心する事」", "徹夜で○○にあたる", "○○レベル", "インフレを○○する", "「危険や災害に備えて、あらかじめ注意し、用心すること」"},
        {"「感情に所属しており、強い感情に位置している」", "激しく怒る事", "酷い立腹", "大○○", "○○する", "先生の○○を買う"},
        {"「感情に所属しており、強い感情及び負の感情に位置している」", "憎み嫌う事", "酷く憎むこと", "戦争を○○する", "○○の科学", "○○のピラミッド"},
        {"「感情に所属しており、強い感情に位置している」", "非常に驚くこと", "大きな驚き", "びっくりして感心する事", "酷く感心すること", "思いがけない出来事に会って驚くこと"},
        {"「感情に所属しており、強い感情及び負の感情に位置している」", "恐れること", "恐れる心", "恐ろしい感じ", "○○にかられる", "○○心"},
        {"「感情に所属しており、強い感情に位置している」", "「感心して、ほめること」", "なげきかなしむこと", "熱意と努力に○○する", "○○Ⅱ", "○○の声を上げる"},
        {"「感情に所属しており、弱い感情に位置している」", "「変ったことも怒らず、おだやかなさま」", "○○な日常を送る", "心の○○", "静かに穏やかな事", "○○死"},
        {"「感情に所属しており、弱い感情に位置している」", "人の関心をそそる面白み", "ある対象に対する特別の関心", "○○に満ちた表情", "○○を引く", "○○がわく"},
        {"感情に所属しており、弱い感情に位置している」", "わずらわしいこと", "うるさいこと", "うるさいさま", "煩瑣", "騒音のうるささ"},
        {"「感情に所属しており、弱い感情に位置している」", "思うようにならなくてつらい", "せつない", "憂鬱だ", "愁い", "悲しみ"},
        {"「感情に所属しており、弱い感情に位置している」", "「相変わらずの状態が続くので心が晴れず、あきること」", "くたびれて気力が衰えること", "いやになること", "いやになるさま", "「することがなくて、時間を持て余すこと」"},
        {"「感情に所属しており、弱い感情に位置している」", "「他からの作用で、動き揺れること」", "「転じて、気持ちなどが不安定になること」", "不安", "さわぎ", "心の○○を隠す"},
        {"「感情に所属しており、弱い感情に位置している」", "おもいわずらうこと", "きがかり", "上手く運ぶように気を使って手配すること", "配慮", "きにかけてめんどうをみること"},
        {"「感情に所属しており、弱い感情に位置している」", "「それでよいとして、認めること」", "行動の自由を○○する", "許せる範囲と認めて許すこと", "複国籍○○", "副業○○"},
        {"「感情に所属しており、七大罪に位置している」", "「取得する経験値、熟練度、各能力値が大幅に上昇する代わりに好戦的になり許容量以上の経験値をため込んでしまう」", "高ぶって人を侮り見下す態度であること", "○○無礼", "調子づいて人を馬鹿にする", "ひとをみくびって礼儀を欠くこと"},
        {"「感情に所属しており、七大罪及び負の感情に位置している」", "「最大で通常の10倍近くまで代償なくステータスを底上げすることが出来るが、やがて唯の狂戦士と化す」", "「つかみかからんばかりの恐ろしい形相で、激しく怒る事」", "○○の悪魔", "非道な行為に○○する", "○○の魔女"},
        {"「感情に所属しており、七大罪に位置している」", "「精神に異常をきたすことは無く、皮肉が込められている」", "「つかみかからんばかりの恐ろしい形相で、激しく怒る事」", "なまけておりだらしないさま", "○○の悪魔", "魔女教大罪司教○○担当"},
        {"「感情に所属しており、七大罪に位置している」", "「eを加えた場合、錬金術で生み出されたメダルを体内に収納しているといずれはグリードへと堕ちていく」", "あくどいほど欲が張っている事", "「際限なく、何が何でも、自分の欲を満たそうとするさま」", "○○の悪魔", "○○の魔女"},
        {"「感情に所属しており、七大罪に位置している」", "「永久空腹は克服可能であり、食したものはエネルギーとしてストックすることが出来る」", "暴飲○○", "○○する", "○○の魔女", "○○者"},
        {"「感情に所属しており、七大罪に位置している」", "「対象となった者は持ち主の意のままに操られるが、継続的に重ね掛けが必要となる」", "性的な欲望", "情欲", "○○の悪魔", "色情と利欲"},
        {"「行動に所属しており、七美徳に位置している」", "「死亡から数分程度でなければ使用できず、使用するごとに禁忌レベルが上昇してきます」", "「仏・菩薩が人々をあわれみ、楽しみを与え、苦しみを取り除くこと」", "「いつくしみ、あわれむこと」", "○○の天使王", "○○深い"},
        {"「行動に所属しており、七美徳に位置している」", "「体力を1残し、生存する」", "「苦しさ、辛さ、悲しさなどを耐え忍ぶこと」", "○○力", "○○の天使", "○○強い"},
        {"「行動に所属しており、七美徳に位置している」", "一日も欠かすことなく毎日同じことを繰り返す", "仕事や勉強に一所懸命に励むこと", "○○家", "「良く働き、学ぶこと」", "たゆまずに一所懸命にあることを続けていく様"},
        {"「行動に所属しており、七美徳に位置している」", "最下級回復術師", "「貧乏人・被災者等を救い、恵むこと」", "困っている人に見舞いの金品などを与えて救うこと", "万人の○○", "○○の王"},
        {"「行動に所属しており、七美徳に位置している」", "切り詰めて行動している", "「欲望におぼれて度を超すことが無いように、適度に慎むこと」", "規律正しく統率のとれている事", "○○生活", "○○の天使"},
        {"「行動に所属しており、七美徳に位置している」", "魂魄の一部を神へと渡すこと", "へりくだること", "謙遜", "○○の美徳", "○○語"},
        {"「行動に所属しており、七美徳に位置している」", "ピュアである", "肉体や心が汚れていない事", "「心身にけがれがなく、清らかな事」", "赤いフリージアの花言葉", "スズランの花言葉"},
        {"「知識に所属しており、感情、七美徳、七大罪のいずれにも位置しない」", "支配者権限に気まぐれで追加されたものである", "深遠な道理を知り得る優れた知恵", "「物事の真実在の理性的、悟性的認識」", "○○の王", "人類の○○"},
        {"「感情に所属しており、負の感情に位置している」", "「他の存在や物事に対して抱く悪い感情、または見方」", "わるぎ", "○○がある", "無意識の○○", "○○の連鎖は止められない"},
        {"「感情に所属しており、負の感情に位置している」", "たたかうこと", "あらそい", "○○本能", "○○の女神", "○○を求める"},
        {"「感情に所属しており、負の感情に位置している」", "存在を殺そうとする意志", "存在を死に至らしめる危険性の高い行為をすることの認識", "どうしようもなく相手に対して苛立ちなどを覚えた際に芽生える感情", "○○の波動", "スノードロップの花言葉より「貴方の死を望みます」"},
        {"「感情に所属しており、負の感情に位置している」", "絶え滅びること", "絶やし滅ぼすこと", "地球上から永遠にいなくなってしますこと", "○○危惧種", "レッドリスト"},
        {"「感情に所属しており、負の感情に位置している」", "存在価値を失うまでに駄目になる事", "存在が身を滅ぼすこと", "○○フラグ", "○○の本", "○○的思考"},
        {"「感情に所属しており、負の感情に位置している」", "滅びること", "絶えてなくなる事", "○○迅雷", "○○迅雷.net", "睡蓮の花言葉"},
        {"「力に所属しており、概念に位置している」", "魔力等のエネルギーを使用して不思議なことを起こさせる術", "「蜘蛛ですが、なにか」の世界において魔術をシステム（魔力を「スキル」により変化させて現象として確立したもの）を通して簡略化したもの", "○○陣", "ホグワーツ○○魔術学校", "治癒○○の間違った使い方"},
        {"「精神力に所属しており、概念に位置している」", "魅力や才能の源とされる輝く精神力", "ジャメンタルの対となる", "キラメイジャーに変身する者に求められる素質", "魔進戦隊キラメイジャーに登場する用語の1つ", "キラメイストーンと共鳴する強靭な輝くの精神"},
        {"「行動に所属しており、概念に位置している」", "「どでかい夢」とか「やった！」「掴んだ！」というような感じ", "一ノ瀬宝太郎は錬金術に見出した", "仮面ライダーガッチャード/一ノ瀬宝太郎の口癖", "仮面ライダーガッチャードに登場する用語の1つ", "上手く行かなかったときはノー○○○○○"},
        {"「精神力に所属しており、概念に位置している」", "「２ディメンションの術を使用したのち必殺技として○○○○○爆裂波を放つ」", "忍者の力の源ともいうべきもの", "手裏剣戦隊ニンニンジャーにて登場する用語の1つ", "高めろ！○○○○○‼", "○○○○○絵巻"},
        {"「虚構の存在に所属しており、概念に位置している」", "同じ肉体で顔の違う科学者が違う結論を導いた者の姿", "○○○ドライバー", "仮面ライダー○○○で登場する用語の1つ", "プロジェクト・○○○", "○○○アップ"},
        {"「概念に位置している」", "「他者への深い感情や情熱を指し、戦争や紛争がない状態や調和を示す」", "○○○○○○の世界へ", "4人が仮面ライダーとして戦う理由の一つ", "仮面ライダービルドに登場する用語の1つ", "葛城忍が科学者になった理由"},
        {"「精神力に所属しており、概念に位置している」", "勇敢であることや恐れを知らぬこと", "○○○○イン", "「真の地球のメロディを聴き、歌うことで○○○○が回復、新たに生み出される」", "獣電戦隊キョウリュウジャーに登場する用語の1つ", "キョウリュウジャー関連でアツいこと等がある"},
        {"「力に所属しており、概念に位置している」", "夢見る力", "想像する力", "「多くの場合は子供にしか宿っておらず、大人になるとそのほとんどが喪失してしまう」", "列車戦隊トッキュウジャーに登場する用語の1つ", "これを動力とするレインボーラインの列車がある"},
        {"「行動に所属しており、概念に位置している」", "モカちゃんの感性で決まる", "モカちゃんらしい", "「興味がわかない物にはとことん無関心だが、好きな人の為には一所懸命になれる様」", "BanGDream!ガールズバンドパーティーに登場する用語の1つ", "造語である"},
        {"「行動に所属しており、概念に位置している」", "「普通が故に努力家で前向き、少しのことではめげないさま」", "造語", "○○○ともいう", "BanGDream!ガールズバンドパーティーに登場する用語の1つ", "○○ってみよ-!"},
        {"「行動に所属しており、概念に位置している」", "可愛いものに対して暴走する様", "造語", "かわいいものに目がない", "D4DJ groovy mixに登場する用語の1つ", "好奇心が強く知識も豊富で、興味のあることには饒舌になる"},
        {"「行動に所属しており、概念に位置している」", "幼馴染に対して愛が重い行動を魅せる", "造語", "○○○○○時は不機嫌だったりする", "D4DJ groovy mixに登場する用語の1つ", "ネット上で「絵師」として注目を集めている本人"},
        {"「行動に所属しており、概念に位置している」", "AI故に単調な行動を取る様", "造語", "ネオに心を届けるために存在する,", "心を得た存在", "歌姫アリアの現身に近い存在"},
        {"感情に所属している", "ある対象に対して感情が変化した時に使用される", "感動を表す", "俗語", "切なさやなつかしさを含む場面が多い", "○○○デザイン"},
        {"感情に所属している", "「（小さくて）愛らしい、小さい、同情を誘うばかりに（痛々しく）かわいそうだ」", "○○○○アイテム", "他と比べて小さいさま", "かわいそうだ", "共感を高め、信頼に出来る関係性を形成する為"},
        {"感情に所属している", "価値が高い", "大切だ", "貴重だ", "身分が高い", "敬うべきだ"},
        {"概念に位置している", "物事を忘れずに覚えている事", "覚えておくこと", "「過去の経験の内容を保持し、後でそれを思い出すこと」", "○○障害", "ガイアメモリに内包されるもの"},
        {"行動に所属しており、概念に位置している", "この概念同士で対立する", "脆き者", "人間の社会的関係において実現されるべき究極的な価値", "人間の対他的関係の規律に関わる法的な価値をさす", "「弱者を救い、悪者を懲らしめる人」"},
        {"行動に所属しており、概念に位置している", "共犯者のみが偉業と称えた行動", "○○的な○のこと", "「本人は悪い事と全く思っていないが、私利私欲や興味関心のためにどう考えても他人にとっては迷惑極まりない行為を平然と行う」", "憎まれることこそ悪の本懐", "「悪いことをしたくて悪事を働き、なおかつそこに何も思うところがない」"},
        {"集団に所属しており、概念に位置している", "演奏に必要なメンバーが全て揃っている状態", "一般にロックを演奏する事を目的", "通信における帯域幅", "通信路容量", "バンドリでは12以上の○○○が存在する"},
        {"職業に所属しており、概念に位置している", "バンドやユニットに参加している人もいる", "ラジオ○○とクラブ○○の2種類の職業がある", "○○ミキサー", "トラックメイカーも兼ねる○○は、○○Remix", "D○○400ハピアラモデル"},
        {"概念に位置している", "相互に影響をおよぼしあう要素から構成される", "まとまりや仕組みの全体", "AI○○○○", "目的を遂行するための体系や組織の意味", "「コンピュータ分野、自然科学分野などを中心に幅広い分野で使われる」"},
        {"力に所属しており、概念に位置している", "あることを行うための技術的な能力", "「魔物肉を直接食し、肉体を回復することで取得出来、取得者が出来る項目が増加することで派生として現れる」", "「物を作る仕事などに関し、それを巧みに（見事に）してのけることが出来る腕前」", "表面的な召喚ボーナスは言語理解と錬成", "潜在能力は○○の個数の分だけ分散する"},
        {"方法に所属しており、概念に位置している", "巧みに行う技・技巧・技芸", "からめ手を得意とする隊員が特殊○○が高い", "「科学の原理を（産業や医療・事務などの活動に）役立てて、物を生産したり組織したりするしかた・わざ」", "物事を巧みに（能率的に）行う技", "「スナイパーを除いて○○のある隊員は戦闘能力の高い人物が多く、○○の高さはその隊員の強さに影響している事が多いです。」"},
        {"力に所属しており、概念に位置している", "「暗黒術とも呼ばれ、神聖力或いは空間リソースと呼ばれるものを消費する」", "システムコールで始まる", "SAOアリシゼーション編に出てくる用語の1つである", "神器が宿した記憶を開放する超高等○○○", "「武装完全支配術、記憶開放術が含まれる」"},
        {"「行動に所属しており、概念に位置している」", "声を用いて音楽を作り出すことをいう", "AI○○ソフトが存在している", "「調の使用、リズム、持続音など様々な発声技術によって通常の音声を強化することで行われる」", "○○を行う人を歌手と言う", "異なる音程の声を歌う歌手による○○団"},
        {"学問に所属しており、概念に位置している", "発達しすぎた○○は魔法と区別がつかないと言われる", "一定の目的・方法のもとに種種の事象を研究する認識活動", "その成果としての体系知識", "自然○○だけを指す場合もある", "日本○○未来館"},
        {"学問に所属しており、概念に位置している", "音による時間の表現", "○○の要素には、リズム、メロディー、ハーモニ―の3要素をもとに、主題、形式、調性、拍子、テンポ、楽器によって構成されます", "直接心身に影響するものと、○○そのものの基盤として間接的に影響するものがあります", "バンドリ！オフィシャルバンドスコアが登場している", "D4DJ groovy mixでは原曲のボーカルでリズムゲームが出来る"},
        {"概念に位置している", "秩序ある統一体としての世界", "あらゆる天体の存在する空間", "ビッグバンによって生まれた", "物体が○○の果てまで飛び去ることが出来る初速度の最小値を第二○○速度", "コズミックエナジーが存在する空間"},
        {"概念に位置している", "その名の付く魔法を全て会得することで概念魔法に至る", "図説○○文字入門", "日本神話における時代区分", "○○凛子博士", "○○兄妹"}
    };

    static {
        for (int i = 0; i < EMOTIONS.length; i++) {
            NUMBERS_MAP.put(Numbers[i], EMOTIONS[i]);
        }
    }

     int attempts = 0;
         Random random = new Random();
        //static Set<Integer> usedIndexes = new HashSet<>();
         int quizIndex = this.random.nextInt(EMOTIONS.length);
         int count = 0;
         int clearcount=0;
                String CorrectAnswer = EMOTIONS[this.quizIndex];
                String[] hints = HINTS[this.quizIndex];
                 String quiz = QUIZ[this.quizIndex];
                String english=ENGLISH[this.quizIndex];
                 String Choice0;
                 String Choice1;
                 String Choice2;
                 String Choice3;
                 String Choice4;
                 String Choice5;
                 String Choice6;
            //private JLabel label = new JLabel();
                JPanel Mpanel = new JPanel();
                Button next = new Button("次へ");
                Button end = new Button("終了");
                Button answerBtn0 = new Button(this.Choice0);
                Button answerBtn1 = new Button(this.Choice1);
                Button answerBtn2 = new Button(this.Choice2);
                Button answerBtn3 = new Button(this.Choice3);
                Button answerBtn4 = new Button(this.Choice4);
                Button answerBtn5 = new Button(this.Choice5);
                Button answerBtn6 = new Button(this.Choice6);
                JFrame frame = new JFrame("感情を含む用語演算変換クイズ");
                JLabel label=new JLabel("クイズ:" + this.quiz);
                int stack=this.clearcount+this.count;
                JLabel lbel=new JLabel(this.stack+"問正解です！ クイズを終了します");
                JLabel laBel=new JLabel("正解"+EMOTIONS[this.quizIndex+this.attempts]);
                JLabel labl=new JLabel("全てのクイズに正解しました!");
                JLabel lael=new JLabel("不正解! ヒント: "+this.hints[this.attempts] );
                JLabel lab = new JLabel("挑戦回数消失! 英語解:" + this.english);
                JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                ImageIcon icon1=new ImageIcon("./マル.png");
                ImageIcon icon3=new ImageIcon("./シフォン.png");
                JLabel label1=new JLabel();

                public void init(){
                    next.addActionListener((ActionListener) this);
                    end.addActionListener((ActionListener) this);
                    answerBtn0.addActionListener((ActionListener) this);
                    answerBtn1.addActionListener((ActionListener) this);
                    answerBtn2.addActionListener((ActionListener) this);
                    answerBtn3.addActionListener((ActionListener) this);
                    answerBtn4.addActionListener((ActionListener) this);
                    answerBtn5.addActionListener((ActionListener) this);
                    answerBtn6.addActionListener((ActionListener)this);
                    frame.setSize(1000, 250);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
                    frame.setVisible(true);
                    frame.setLayout(new FlowLayout());
                    frame.add(this.Mpanel);

                    Mpanel.add(this.answerBtn0);
                    Mpanel.add(this.answerBtn1);
                    Mpanel.add(this.answerBtn2);
                    Mpanel.add(this.answerBtn3);
                    Mpanel.add(this.answerBtn4);
                    Mpanel.add(this.answerBtn5);
                    Mpanel.add(this.answerBtn6);
                    Mpanel.add(this.next);
                    Mpanel.add(this.end);
                    label1.setIcon(this.icon1);
                    JLabel label3=new JLabel(this.icon3);
                    Mpanel.add(this.label1);
                    Mpanel.add(label3);
                    /*SoundTurtle bgm=new SoundTurtle("世界に楽しいを届けて(カスタマイズ).mp3");
                bgm.loadOnMemory();
                bgm.loop();
                bgm.stop();*/
                    Container contentPane = frame.getContentPane();
                    contentPane.add(this.Mpanel, BorderLayout.CENTER);
                    frame.setVisible(true);
                    //Contains();
                }
                /*public void actionPerfomed(ActionEvent e){
                    if(e.getSource()==this.next){
                        do {
                            this.quizIndex = random.nextInt(QUIZ.length);
                        } while ((this.clearcount+this.count)>=3);
                        this.quiz = QUIZ[this.quizIndex];
                        this.hints = HINTS[this.quizIndex];
                    this.attempts = 0;
                    Contains();
                    }
                    else if(e.getSource()==this.end){
                        panel.add(this.lbel, BorderLayout.CENTER);
                        System.exit(0);
                    }
                    else if(e.getSource()==this.answerBtn0){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn1){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn2){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn3){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn4){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn5){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    else if(e.getSource()==this.answerBtn6){
                        JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    Goodjuage();
                    answerBtn0.setEnabled(true);
                }else {answerBtn0.setEnabled(false);
                    Badjuage();
                }
                    }
                    }*/
                public  void Quizput(){
                    //this.label=new JLabel("クイズ:" + this.quiz);
                    //panel.add(label);
                    Mpanel.add(this.label, BorderLayout.CENTER);
                    System.out.println("クイズ:" + this.quiz);
                    Contains();
                    //init();
            }
                public static void main(String[] args) throws IOException {
                    //try (Scanner scanner = new Scanner(System.in)) {
                    //int attempts = 0;
                   // Random random = new Random();
                    //Set<Integer> usedIndexes = new HashSet<>();
                    // int quizIndex = random.nextInt(EMOTIONS.length);
                    //usedIndexes.add(quizIndex);
                    //int count=0;
                    //String CorrectAnswer = EMOTIONS[quizIndex];
                    //String[] hints = HINTS[quizIndex];
                    //String quiz = QUIZ[quizIndex];
                    /*JFrame frame = new JFrame("感情を含む用語演算変換クイズ");
                    frame.setSize(1000, 250);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new FlowLayout());
                    JPanel Mpanel = new JPanel();
                    JLabel label = new JLabel();
                    Button next = new Button("次へ");
                    Button end = new Button("終了");*/
                    App a=new App();
                    a.Quizput();
                    //a.init();
                    /*frame.add(panel);
                    Mpanel.add(new JLabel("クイズ:" + quiz));
                    /*String Choice0=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice1=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice2=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice3=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice4=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice5=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice6=NUMBERS_MAP.get(Numbers[quizIndex]);*/
             /*if(Choice0!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice0=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice1!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice1=NUMBERS_MAP.get(Numbers[quizIndex+1]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice2!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice2=NUMBERS_MAP.get(Numbers[quizIndex+2]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice3!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice3=NUMBERS_MAP.get(Numbers[quizIndex+3]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice4!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice4=NUMBERS_MAP.get(Numbers[quizIndex+4]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice5!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice5=NUMBERS_MAP.get(Numbers[quizIndex+5]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice6!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice6=NUMBERS_MAP.get(Numbers[quizIndex+6]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{Choice6=NUMBERS_MAP.get(Numbers[quizIndex-6]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{Choice5=NUMBERS_MAP.get(Numbers[quizIndex-5]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{Choice4=NUMBERS_MAP.get(Numbers[quizIndex-4]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{ Choice3=NUMBERS_MAP.get(Numbers[quizIndex-3]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{Choice2=NUMBERS_MAP.get(Numbers[quizIndex-2]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{Choice1=NUMBERS_MAP.get(Numbers[quizIndex-1]);}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }else{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice0=NUMBERS_MAP.get(Numbers[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }*/
             /*for(int i=0;i<7;i++){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            String Choice = NUMBERS_MAP.get(Numbers[quizIndex+i]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(Choice!=null){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice = NUMBERS_MAP.get(Numbers[quizIndex+i]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }else{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Choice = NUMBERS_MAP.get(Numbers[quizIndex-i]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if(i<6){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            System.out.print(Choice+",");}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            else{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            System.out.println(Choice+":選択肢");}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            panel.add(new JLabel(Choice));*/
             /*Button answerBtn0 = new Button(Choice0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            answerBtn0.setBounds(10,10,50,30);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn0);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn1 = new Button(Choice1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn1,BorderLayout.CENTER);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn2 = new Button(Choice2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn2,BorderLayout.CENTER);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn3 = new Button(Choice3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn3,BorderLayout.CENTER);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn4 = new Button(Choice4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn4,BorderLayout.CENTER);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn5 = new Button(Choice5);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn5,BorderLayout.CENTER);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button answerBtn6 = new Button(Choice6);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Mpanel.add(answerBtn6,BorderLayout.CENTER);*/
                    /*Mpanel.add(next);
                    Mpanel.add(end);
                    JButton[] answerbuttons = {answerBtn0,answerBtn1,answerBtn2,answerBtn3,answerBtn4,answerBtn5,answerBtn6};
                    //for (JButton button : answerbuttons) {
                    //button.addActionListener(new Activity());
                    //}
                   // System.out.println("クイズ:" + quiz);
                    panel.add(label, BorderLayout.CENTER);
                    frame.add(panel);
                    Container contentPane = frame.getContentPane();
                    contentPane.add(panel, BorderLayout.CENTER);
                    frame.setVisible(true);
                    Contains();
                    next();*/
                    /*JTextField textField=new JTextField("回答",10);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            textField.setFont(new Font("Arial", Font.PLAIN, 20));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            panel.add(textField);*/
             /*JTextArea textArea = new JTextArea(10, 30);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            textArea.setFont(new Font("Arial", Font.PLAIN, 20));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            panel.add(textArea);*/
             /*answerBtn0.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn1.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn2.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn3.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn4.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn5.setEnabled(true);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    answerBtn6.setEnabled(true);*/
            
             /*while (attempts < 7) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("回答を入力してください:");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                String answer = scanner.nextLine();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                String str=br.readLine();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if(str.equals(CorrectAnswer)){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("正解: " + EMOTIONS[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if(usedIndexes.size() >=3){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("全てのクイズに正解しました!");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        break;}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    do{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        quizIndex = random.nextInt(QUIZ.length);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }while(usedIndexes.contains(quizIndex));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    usedIndexes.add(quizIndex);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hints = HINTS[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    quiz=QUIZ[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("次のクイズ:"+quiz);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    attempts = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }*/
                    //public void actionPerformed(ActionEvent e) {
                    /*String str=textArea.getText();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Button answerbutton = (Button) e.getSource();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    String ButtonText = answerbutton.getText();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (str.equals(CorrectAnswer)) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("正解: " + EMOTIONS[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if(usedIndexes.size() >=3){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            System.out.println("全てのクイズに正解しました!");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            break;}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        do{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            quizIndex = random.nextInt(QUIZ.length);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }while(usedIndexes.contains(quizIndex));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        usedIndexes.add(quizIndex);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        hints = HINTS[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        quiz=QUIZ[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("次のクイズ:"+quiz);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        attempts = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }*/
             /*for (JButton button : answerbuttons) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                button.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        JButton answerbutton = (JButton) e.getSource();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        String ButtonText = answerbutton.getText();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (ButtonText.equals(CorrectAnswer)) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("正解: " + EMOTIONS[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if(usedIndexes.size() >=3){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("全てのクイズに正解しました!");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             }*/
             /*if(answer.equals(CorrectAnswer)){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("正解: " + EMOTIONS[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if(usedIndexes.size() >=3){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("全てのクイズに正解しました!");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break;}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                do{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    quizIndex = random.nextInt(QUIZ.length);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }while(usedIndexes.contains(quizIndex));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                usedIndexes.add(quizIndex);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                hints = HINTS[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                quiz=QUIZ[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("次のクイズ:"+quiz);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                attempts = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (attempts == 7) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if(count>=3){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("全てのクイズに不正解しました!");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    break;}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                do{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    quizIndex = random.nextInt(QUIZ.length);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }while(usedIndexes.contains(quizIndex));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                count++;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                hints = HINTS[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                quiz=QUIZ[quizIndex];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("次のクイズ:"+quiz);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                attempts = 0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if(attempts<6){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("不正解! ヒント: " + hints[attempts]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }else{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("不正解! 英語解:"+ENGLISH[quizIndex]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                attempts++;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }*/
                    System.out.println("クイズを終了します");
                    //End();
                    //}
                }
            /*public  void next(){
                Button next = new Button("次へ");
                panel.add(next,BorderLayout.SOUTH);
                next.addActionListener((ActionEvent e) -> {
                    do {
                        this.quizIndex = random.nextInt(QUIZ.length);
                    } while ((this.clearcount+this.count)>=3);
                    this.quiz = QUIZ[this.quizIndex];
                    this.hints = HINTS[this.quizIndex];
                this.attempts = 0;
                    //System.out.println("次のクイズ:" + this.quiz);
                    Contains();
                });
            }*/
            /*public  void End(){
                Button end = new Button("終了");
                panel.add(end,BorderLayout.SOUTH);
                //int stack=this.clearcount+this.count;
                end.addActionListener((ActionEvent e) -> {
         this.label=new JLabel(stack+"問正解です！ クイズを終了します");
        panel.add(label);
        System.exit(0);
                });
}*/
    public void Contains() {
            //usedIndexes.add(this.quizIndex);
            if (this.quizIndex <=EMOTIONS.length) {
                this.Choice0 = NUMBERS_MAP.get(Numbers[this.quizIndex]);
                if (this.quizIndex+1<=EMOTIONS.length) {
                    this.Choice1 = NUMBERS_MAP.get(Numbers[this.quizIndex + 1]);
                    if (this.quizIndex+2 <=EMOTIONS.length) {
                        this.Choice2 = NUMBERS_MAP.get(Numbers[this.quizIndex + 2]);
                        if (this.quizIndex+3 <=EMOTIONS.length) {
                            this.Choice3 = NUMBERS_MAP.get(Numbers[this.quizIndex + 3]);
                            if (this.quizIndex+4<=EMOTIONS.length) {
                                this.Choice4 = NUMBERS_MAP.get(Numbers[this.quizIndex + 4]);
                                if (this.quizIndex+5 <=EMOTIONS.length) {
                                    this.Choice5 = NUMBERS_MAP.get(Numbers[this.quizIndex + 5]);
                                    if (this.quizIndex+6 <=EMOTIONS.length) {
                                        this.Choice6 = NUMBERS_MAP.get(Numbers[this.quizIndex + 6]);
                                    } else {
                                        this.Choice6 = NUMBERS_MAP.get(Numbers[this.quizIndex - 6]);
                                    }
                                } else {
                                    this.Choice5 = NUMBERS_MAP.get(Numbers[this.quizIndex - 5]);
                                }
                            } else {
                                this.Choice4 = NUMBERS_MAP.get(Numbers[this.quizIndex - 4]);
                            }
                        } else {
                            this.Choice3 = NUMBERS_MAP.get(Numbers[this.quizIndex - 3]);
                        }
                    } else {
                        this.Choice2 = NUMBERS_MAP.get(Numbers[this.quizIndex - 2]);
                    }
                } else {
                    this.Choice1 = NUMBERS_MAP.get(Numbers[this.quizIndex - 1]);
                }
            } else {
                this.Choice0 = NUMBERS_MAP.get(Numbers[this.quizIndex]);
            }
            init();
            Answer0();
            Answer1();
            Answer2();
            Answer3();
            Answer4();
            Answer5();
            Answer6();
    }
public void Goodjuage(){
    System.out.println("正解: " + EMOTIONS[this.quizIndex+this.attempts]);
    //JLabel laBel=new JLabel("正解"+EMOTIONS[this.quizIndex+this.attempts]);
                    Mpanel.add(this.laBel,BorderLayout.CENTER);
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                         //this.label=new JLabel("全てのクイズに正解しました!");
                        //panel.add(label);
                        Mpanel.add(this.labl, BorderLayout.CENTER);
                        //End();
                    }
                    this.clearcount++;
                    //next();
}
public void Badjuage(){
    if (this.attempts < 6) {
        System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
        //this.label=new JLabel("不正解! ヒント: "+this.hints[this.attempts] );
        //panel.add(label,this.attempts);
        Mpanel.add(this.lael, BorderLayout.CENTER);
    } else {
        System.out.println("挑戦回数消失! 英語解:" + ENGLISH[this.quizIndex]);
         //this.label = new JLabel("挑戦回数消失! 英語解:" + this.english);
        //panel.add(label, this.attempts);
        Mpanel.add(this.lab, BorderLayout.CENTER);
        if (this.count >= 3) {
            System.out.println("全てのクイズに不正解しました!");
            //JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
            //panel.add(lAbel);
            Mpanel.add(this.lAbel, BorderLayout.CENTER);
            //End();
        }
        this.count++;
        //next();
    }
    this.attempts++;
}
    /*public App(){
        Button answerBtn0 = new Button(Choice0);
        Mpanel.add(answerBtn0);
        answerBtn0.setEnabled(true);
        answerBtn0.addActionListener((ActionEvent e) -> {
            JButton answerbutton = (JButton) e.getSource();
            String ButtonText = answerbutton.getText();
            if (ButtonText.equals(CorrectAnswer)) {
                System.out.println("正解: " + EMOTIONS[quizIndex]);
                Mpanel.add("正解: ", answerbutton);
                answerBtn0.setEnabled(true);
                if (usedIndexes.size() >= 3) {
                    System.out.println("全てのクイズに正解しました!");
                }
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            else {answerBtn0.setEnabled(false);
            if (attempts < 6) {
                System.out.println("不正解! ヒント: " + hints[attempts]);
                JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                Mpanel.add(label,attempts);
            } else {
                System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                Mpanel.add(label, attempts);
                if (count >= 3) {
                    System.out.println("全てのクイズに不正解しました!");
                }count++;
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            attempts++;
            }
        });
            Button answerBtn1 = new Button(Choice1);
        Mpanel.add(answerBtn1);
        answerBtn1.setEnabled(true);
        answerBtn1.addActionListener((ActionEvent e) -> {
            JButton answerbutton = (JButton) e.getSource();
            String ButtonText = answerbutton.getText();
            if (ButtonText.equals(CorrectAnswer)) {
                System.out.println("正解: " + EMOTIONS[quizIndex]);
                Mpanel.add("正解: ", answerbutton);
                answerBtn1.setEnabled(true);
                if (usedIndexes.size() >= 3) {
                    System.out.println("全てのクイズに正解しました!");
                }
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            else {answerBtn1.setEnabled(false);
            if (attempts < 6) {
                System.out.println("不正解! ヒント: " + hints[attempts]);
                JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                Mpanel.add(label,attempts);
            } else {
                System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                Mpanel.add(label, attempts);
                if (count >= 3) {
                    System.out.println("全てのクイズに不正解しました!");
                }count++;
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            attempts++;
            }
        });
            Button answerBtn2 = new Button(Choice2);
        Mpanel.add(answerBtn2);
        answerBtn2.setEnabled(true);
        answerBtn2.addActionListener((ActionEvent e) -> {
            JButton answerbutton = (JButton) e.getSource();
            String ButtonText = answerbutton.getText();
            if (ButtonText.equals(CorrectAnswer)) {
                System.out.println("正解: " + EMOTIONS[quizIndex]);
                Mpanel.add("正解: ", answerbutton);
                answerBtn2.setEnabled(true);
                if (usedIndexes.size() >= 3) {
                    System.out.println("全てのクイズに正解しました!");
                }
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            else {answerBtn2.setEnabled(false);
            if (attempts < 6) {
                System.out.println("不正解! ヒント: " + hints[attempts]);
                JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                Mpanel.add(label,attempts);
            } else {
                System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                Mpanel.add(label, attempts);
                if (count >= 3) {
                    System.out.println("全てのクイズに不正解しました!");
                }count++;
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            attempts++;
            }
        });
            Button answerBtn3 = new Button(Choice3);
        Mpanel.add(answerBtn3);
        answerBtn3.setEnabled(true);
        answerBtn3.addActionListener((ActionEvent e) -> {
            JButton answerbutton = (JButton) e.getSource();
            String ButtonText = answerbutton.getText();
            if (ButtonText.equals(CorrectAnswer)) {
                System.out.println("正解: " + EMOTIONS[quizIndex]);
                Mpanel.add("正解: ", answerbutton);
                answerBtn3.setEnabled(true);
                if (usedIndexes.size() >= 3) {
                    System.out.println("全てのクイズに正解しました!");
                }
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            else {answerBtn3.setEnabled(false);
            if (attempts < 6) {
                System.out.println("不正解! ヒント: " + hints[attempts]);
                JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                Mpanel.add(label,attempts);
            } else {
                System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                Mpanel.add(label, attempts);
                if (count >= 3) {
                    System.out.println("全てのクイズに不正解しました!");
                }count++;
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            attempts++;
            }
        });
            Button answerBtn4 = new Button(Choice4);
            Mpanel.add(answerBtn4);
            answerBtn4.setEnabled(true);
            answerBtn4.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn4.setEnabled(true);
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    hints = HINTS[quizIndex];
                    attempts = 0;
                }
                else {answerBtn4.setEnabled(false);
                if (attempts < 6) {
                    System.out.println("不正解! ヒント: " + hints[attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                    Mpanel.add(label,attempts);
                } else {
                    System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                    Mpanel.add(label, attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }count++;
                    hints = HINTS[quizIndex];
                    attempts = 0;
                }
                attempts++;
                }
        });
                Button answerBtn5 = new Button(Choice5);
                Mpanel.add(answerBtn5);
                answerBtn5.setEnabled(true);
                answerBtn5.addActionListener((ActionEvent e) -> {
                    JButton answerbutton = (JButton) e.getSource();
                    String ButtonText = answerbutton.getText();
                    if (ButtonText.equals(CorrectAnswer)) {
                        System.out.println("正解: " + EMOTIONS[quizIndex]);
                        Mpanel.add("正解: ", answerbutton);
                        answerBtn5.setEnabled(true);
                        if (usedIndexes.size() >= 3) {
                            System.out.println("全てのクイズに正解しました!");
                        }
                        hints = HINTS[quizIndex];
                        attempts = 0;
                    }
                    else {answerBtn5.setEnabled(false);
                    if (attempts < 6) {
                        System.out.println("不正解! ヒント: " + hints[attempts]);
                        JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                        Mpanel.add(label,attempts);
                    } else {
                        System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                        JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                        Mpanel.add(label, attempts);
                        if (count >= 3) {
                            System.out.println("全てのクイズに不正解しました!");
                        }count++;
                        hints = HINTS[quizIndex];
                        attempts = 0;
                    }
                    attempts++;
                    }
        }); 
                    Button answerBtn6 = new Button(Choice6);
        Mpanel.add(answerBtn6);
        answerBtn6.setEnabled(true);
        answerBtn6.addActionListener((ActionEvent e) -> {
            JButton answerbutton = (JButton) e.getSource();
            String ButtonText = answerbutton.getText();
            if (ButtonText.equals(CorrectAnswer)) {
                System.out.println("正解: " + EMOTIONS[quizIndex]);
                Mpanel.add("正解: ", answerbutton);
                answerBtn6.setEnabled(true);
                if (usedIndexes.size() >= 3) {
                    System.out.println("全てのクイズに正解しました!");
                }
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            else {answerBtn6.setEnabled(false);
            if (attempts < 6) {
                System.out.println("不正解! ヒント: " + hints[attempts]);
                JLabel label=new JLabel("不正解! ヒント: " + hints[attempts]);
                Mpanel.add(label,attempts);
            } else {
                System.out.println("挑戦回数消失! 英語解:" + ENGLISH[quizIndex]);
                JLabel label = new JLabel("挑戦回数消失! 英語解:" + english);
                Mpanel.add(label, attempts);
                if (count >= 3) {
                    System.out.println("全てのクイズに不正解しました!");
                }count++;
                hints = HINTS[quizIndex];
                attempts = 0;
            }
            attempts++;
            }
        });           
                }*/
    public void Answer0() {
        Mpanel.add(this.answerBtn0);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn0 = new Button(this.Choice0);
        panel.add(answerBtn0,BorderLayout.SOUTH);
        answerBtn0.setEnabled(true);
        while (attempts < 7) {
            answerBtn0.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(CorrectAnswer)) {
                    Goodjuage();
                    /*System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn0.setEnabled(true);
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    this.clearcount++;
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                answerBtn0.setEnabled(false);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                } 
                else {answerBtn0.setEnabled(false);
                    Badjuage();
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("挑戦回数消失! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                }
        });
        }*/
    }

    public void Answer1() {
        Mpanel.add(this.answerBtn1);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn1 = new Button(this.Choice1);
        panel.add(answerBtn1,BorderLayout.SOUTH);
        answerBtn1.setEnabled(true);
        while (attempts < 7) {
            answerBtn1.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(CorrectAnswer)) {
                    /*System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn1.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    this.clearcount++;
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                } 
                else {answerBtn1.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }

    public void Answer2() {
        Mpanel.add(this.answerBtn2);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn2 = new Button(this.Choice2);
        panel.add(answerBtn2,BorderLayout.SOUTH);
        answerBtn2.setEnabled(true);
        while (attempts < 7) {
            answerBtn2.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn2.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                }
                else {answerBtn2.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }

    public void Answer3() {
        Mpanel.add(this.answerBtn3);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn3 = new Button(this.Choice3);
        panel.add(answerBtn3 ,BorderLayout.SOUTH);
        answerBtn3.setEnabled(true);
        while (attempts < 7) {
            answerBtn3.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn3.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                } 
                else {answerBtn3.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" +this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    /*hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }

    public void Answer4() {
        Mpanel.add(this.answerBtn4);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn4 = new Button(this.Choice4);
        panel.add(answerBtn4,BorderLayout.SOUTH);
        answerBtn4.setEnabled(true);
        while (attempts < 7) {
            answerBtn4.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn4.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }+
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    this.clearcount++;
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                }
                else {answerBtn4.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    /*hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }

    public void Answer5() {
    Mpanel.add(this.answerBtn5);
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn5 = new Button(this.Choice5);
        panel.add(answerBtn5,BorderLayout.SOUTH);
        answerBtn5.setEnabled(true);
        while (attempts < 7) {
            answerBtn5.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn5.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    this.clearcount++;
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                }
                else {answerBtn5.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                        quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    /*hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }

    public void Answer6() {
        /*Contains();
        usedIndexes.add(quizIndex);
        if (Choice0 != null) {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
            if (Choice1 != null) {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex + 1]);
                if (Choice2 != null) {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex + 2]);
                    if (Choice3 != null) {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex + 3]);
                        if (Choice4 != null) {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex + 4]);
                            if (Choice5 != null) {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex + 5]);
                                if (Choice6 != null) {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex + 6]);
                                } else {
                                    Choice6 = NUMBERS_MAP.get(Numbers[quizIndex - 6]);
                                }
                            } else {
                                Choice5 = NUMBERS_MAP.get(Numbers[quizIndex - 5]);
                            }
                        } else {
                            Choice4 = NUMBERS_MAP.get(Numbers[quizIndex - 4]);
                        }
                    } else {
                        Choice3 = NUMBERS_MAP.get(Numbers[quizIndex - 3]);
                    }
                } else {
                    Choice2 = NUMBERS_MAP.get(Numbers[quizIndex - 2]);
                }
            } else {
                Choice1 = NUMBERS_MAP.get(Numbers[quizIndex - 1]);
            }
        } else {
            Choice0 = NUMBERS_MAP.get(Numbers[quizIndex]);
        }
        Button answerBtn6 = new Button(this.Choice6);
        panel.add(answerBtn6,BorderLayout.SOUTH);
        answerBtn6.setEnabled(true);
        while (attempts < 7) {
            answerBtn6.addActionListener((ActionEvent e) -> {
                JButton answerbutton = (JButton) e.getSource();
                String ButtonText = answerbutton.getText();
                if (ButtonText.equals(this.CorrectAnswer)) {
                    System.out.println("正解: " + EMOTIONS[this.quizIndex]);
                    Mpanel.add("正解: ", answerbutton);
                    answerBtn6.setEnabled(true);
                    Goodjuage();
                    if (usedIndexes.size() >= 3) {
                        System.out.println("全てのクイズに正解しました!");
                    }
                    if(this.clearcount>=3){
                        System.out.println("全てのクイズに正解しました!");
                        JLabel label=new JLabel("全てのクイズに正解しました!");
                        Mpanel.add(label);
                        End();
                    }
                    this.clearcount++;
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    usedIndexes.add(quizIndex);
                    hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                if (attempts == 7) {
                System.out.println("ゲームオーバー! 正解は: " + EMOTIONS[quizIndex]);
                if (count >= 3) {
                System.out.println("全てのクイズに不正解しました!");
                }
                do {
                quizIndex = random.nextInt(QUIZ.length);
                } while (usedIndexes.contains(quizIndex));
                count++;
                hints = HINTS[quizIndex];
                quiz = QUIZ[quizIndex];
                System.out.println("次のクイズ:" + quiz);
                attempts = 0;
                } 
                else {answerBtn6.setEnabled(false);
                if (this.attempts < 6) {
                    System.out.println("不正解! ヒント: " + this.hints[this.attempts]);
                    JLabel label=new JLabel("不正解! ヒント: " + this.hints[this.attempts]);
                    Mpanel.add(label,this.attempts);
                } else {
                    System.out.println("不正解! 英語解:" + ENGLISH[this.quizIndex]);
                    JLabel label = new JLabel("挑戦回数消失! 英語解:" + this.english);
                    Mpanel.add(label, this.attempts);
                    if (count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                    }
                    if (this.count >= 3) {
                        System.out.println("全てのクイズに不正解しました!");
                        JLabel lAbel=new JLabel("全てのクイズに不正解しました！");
                        Mpanel.add(lAbel);
                        End();
                    }
                    do {
                    quizIndex = random.nextInt(QUIZ.length);
                    } while (usedIndexes.contains(quizIndex));
                    this.count++;
                    /*hints = HINTS[quizIndex];
                    quiz = QUIZ[quizIndex];
                    System.out.println("次のクイズ:" + quiz);
                    attempts = 0;
                }
                this.attempts++;
                    Badjuage();
                }
        });
        }*/
    }
}
//1CEI1217 大西凜 最終課題
/*今はデータとプログラムが一体になっているが、プログラムを１つにしてデータだけ変えれば情報を追加できるようにする
たとえば、ヒントの文字列を配列に入れておけば、何回目かの変数でその配列の要素を参照するだけでswitch文を使う必要がなくなる*/
 /*@SuppressWarnings("ManualArrayToCollectionCopy")
public static void feeling(String[][] emotions){
        String emo[][]={
        {"愛憎","楽観","病的状態","積極性","誇り","冷笑","悲観","軽蔑","嫉妬","憤慨"},
        {"自責","不信","恥","失望","絶望","感傷","畏敬","好奇心","歓喜","服従"},
        {"罪悪感","不安","愛","希望","優位","楽しい","怒り","悲しみ","悲痛","喜び"},
        {"恐れ","驚き","嫌悪","期待","信頼","恍惚","警戒","激怒","憎悪","驚嘆"},
        {"恐怖","感嘆","平穏","興味","煩さ","憂い","退屈","動揺","心配","容認"},
        {"傲慢","憤怒","怠惰","強欲","暴食","色欲","慈悲","忍耐","勤勉","救恤"},
        {"節制","謙譲","純潔","叡智","悪意","闘争","殺意","絶滅","破滅","滅亡"},
        {"魔法","キラメンタル","ガッチャ！","忍タリティ","ビルド","ラブ＆ピース","ブレイブ","イマジネーション","モカってる","ツグってる"},
        {"ノアってる","むにってる","ルミナってる","エモい","可愛い","尊い","記憶","正義","絶対悪","バンド"},
        {"DJ","システム","技能","技術","神聖術","歌唱","科学","音楽","宇宙","神代"}};
        /*char c='"';
        String str[]=new String[100];
        for(int i=0;i<emo.length;i++){
            if(emo[i].charAt(0)==c&&emo[i].charAt(str[i].length()-1)==c){
             emo[i].substring(1,emo[i].length()-1);
             str[i]=emo[i];
               }else{
                    str[i]=emo[i];
               }
            emotions[i]=str[i];
        }*/
 /*for(int i=0;i<emo.length;i++){
            for(int j=0;j<emo.length;j++){
            emotions[i][j]=emo[i][j];
        }
        }
    }
private static final Map<String,String>MAP;
static{
    /*String emotions[]=new String[100];
    String number[]=new String[100];
sub(number);
    feeling(emotions);
    Map<String,String>map=new HashMap<>();
    for(int i=0;i<100;i++){
        map.put(emotions[i],number[i]);
    }
    MAP=Collections.unmodifiableMap(map);
    String emo[][]={
        {"愛憎","楽観","病的状態","積極性","誇り","冷笑","悲観","軽蔑","嫉妬","憤慨"},
        {"自責","不信","恥","失望","絶望","感傷","畏敬","好奇心","歓喜","服従"},
        {"罪悪感","不安","愛","希望","優位","楽しい","怒り","悲しみ","悲痛","喜び"},
        {"恐れ","驚き","嫌悪","期待","信頼","恍惚","警戒","激怒","憎悪","驚嘆"},
        {"恐怖","感嘆","平穏","興味","煩さ","憂い","退屈","動揺","心配","容認"},
        {"傲慢","憤怒","怠惰","強欲","暴食","色欲","慈悲","忍耐","勤勉","救恤"},
        {"節制","謙譲","純潔","叡智","悪意","闘争","殺意","絶滅","破滅","滅亡"},
        {"魔法","キラメンタル","ガッチャ！","忍タリティ","ビルド","ラブ＆ピース","ブレイブ","イマジネーション","モカってる","ツグってる"},
        {"ノアってる","むにってる","ルミナってる","エモい","可愛い","尊い","記憶","正義","絶対悪","バンド"},
        {"DJ","システム","技能","技術","神聖術","歌唱","科学","音楽","宇宙","神代"}};
    String numbers[][]={
        {"0","1","2","3","4","5","6","7","8","9"},
        {"10","11","12","13","14","15","16","17","18","19"},
        {"20","21","22","23","24","25","26","27","28","29"},
        {"30","31","32","33","34","35","36","37","38","39"}, 
        {"40","41","42","43","44","45","46","47","48","49"},
        {"50","51","52","53","54","55","56","57","58","59"},
        {"60","61","62","63","64","65","66","67","68","69"},
        {"70","71","72","73","74","75","76","77","78","79"},
        {"80","81","82","83","84","85","86","87","88","89"},
        {"90","91","92","93","94","95","96","97","98","99"}};    
        /*Map<String,String>himap=new HashMap<>();
    for(int i=0;i<100;i++){
        himap.put(emo[i],numbers[i]);
    }
        MAP=Collections.unmodifiableMap(himap);
        Map<String,String>treemap=new TreeMap<>();
        for(int i=0;i<100;i++){
            treemap.put(emo[i],numbers[i]);
        }
        MAP=Collections.unmodifiableMap(treemap);
        Map<String,String>linkmap=new LinkedHashMap<>();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            linkmap.put(emo[i][j],numbers[i][j]);
        }
        }
        MAP=Collections.unmodifiableMap(linkmap);
}
/*public static Map<String,String> setMap(){
    @SuppressWarnings("unused")
    String emo[][]={
        {"愛憎","楽観","病的状態","積極性","誇り","冷笑","悲観","軽蔑","嫉妬","憤慨"},
        {"自責","不信","恥","失望","絶望","感傷","畏敬","好奇心","歓喜","服従"},
        {"罪悪感","不安","愛","希望","優位","楽しい","怒り","悲しみ","悲痛","喜び"},
        {"恐れ","驚き","嫌悪","期待","信頼","恍惚","警戒","激怒","憎悪","驚嘆"},
        {"恐怖","感嘆","平穏","興味","煩さ","憂い","退屈","動揺","心配","容認"},
        {"傲慢","憤怒","怠惰","強欲","暴食","色欲","慈悲","忍耐","勤勉","救恤"},
        {"節制","謙譲","純潔","叡智","悪意","闘争","殺意","絶滅","破滅","滅亡"},
        {"魔法","キラメンタル","ガッチャ！","忍タリティ","ビルド","ラブ＆ピース","ブレイブ","イマジネーション","モカってる","ツグってる"},
        {"ノアってる","むにってる","ルミナってる","エモい","可愛い","尊い","記憶","正義","絶対悪","バンド"},
        {"DJ","システム","技能","技術","神聖術","歌唱","科学","音楽","宇宙","神代"}};
    @SuppressWarnings("unused")
        String numbers[][]={
        {"0","1","2","3","4","5","6","7","8","9"},
        {"10","11","12","13","14","15","16","17","18","19"},
        {"20","21","22","23","24","25","26","27","28","29"},
        {"30","31","32","33","34","35","36","37","38","39"}, 
        {"40","41","42","43","44","45","46","47","48","49"},
        {"50","51","52","53","54","55","56","57","58","59"},
        {"60","61","62","63","64","65","66","67","68","69"},
        {"70","71","72","73","74","75","76","77","78","79"},
        {"80","81","82","83","84","85","86","87","88","89"},
        {"90","91","92","93","94","95","96","97","98","99"}};    
        return MAP;
}
public static Map<String, String> getMap() {
    MAP.containsKey("愛憎");
    return MAP;
}    
private static final Map<String,String>EXMAP;
static{
String numbers[][]={
    {"0","1","2","3","4","5","6","7","8","9"},
    {"10","11","12","13","14","15","16","17","18","19"},
    {"20","21","22","23","24","25","26","27","28","29"},
    {"30","31","32","33","34","35","36","37","38","39"}, 
    {"40","41","42","43","44","45","46","47","48","49"},
    {"50","51","52","53","54","55","56","57","58","59"},
    {"60","61","62","63","64","65","66","67","68","69"},
    {"70","71","72","73","74","75","76","77","78","79"},
    {"80","81","82","83","84","85","86","87","88","89"},
    {"90","91","92","93","94","95","96","97","98","99"}};
    java.util.Scanner scanner=new java.util.Scanner(System.in);
    String scan=scanner.nextLine();
/*Map<String,String>exMap=new HashMap<>();
for(int i=0;i<100;i++){
    exMap.put(numbers[i],scan);
}
EXMAP=Collections.unmodifiableMap(exMap);*/
 /*Map<String,String>exmap=new LinkedHashMap<>();
for(int i=0;i<10;i++){
    for(int j=0;j<10;j++){
    exmap.put(numbers[i][j],scan);
    }
}
EXMAP=Collections.unmodifiableMap(exmap);
}    
public static Map<String,String> setExmap(){
     @SuppressWarnings("unused")
     String numbers[][]={
        {"0","1","2","3","4","5","6","7","8","9"},
        {"10","11","12","13","14","15","16","17","18","19"},
        {"20","21","22","23","24","25","26","27","28","29"},
        {"30","31","32","33","34","35","36","37","38","39"}, 
        {"40","41","42","43","44","45","46","47","48","49"},
        {"50","51","52","53","54","55","56","57","58","59"},
        {"60","61","62","63","64","65","66","67","68","69"},
        {"70","71","72","73","74","75","76","77","78","79"},
        {"80","81","82","83","84","85","86","87","88","89"},
        {"90","91","92","93","94","95","96","97","98","99"}};
     java.util.Scanner scanner=new java.util.Scanner(System.in);
     @SuppressWarnings("unused")
    String scan=scanner.nextLine();
        return EXMAP;
}
public static Map<String, String> getExmap() {
    EXMAP.containsKey("0");
    return EXMAP;
}
    /*public static Void trimDoubleQuot(String[] str){
        char c='"';
        String emotions[]=new String[100];
        feeling(emotions);
        for(int i=0;i<100;i++){
        str[i]=emotions[i];
        if(str[i].charAt(0)==c&&str[i].charAt(str[i].length()-1)==c){
         return str[i].substring(1,str[i].length()-1);
        }else{
            return str[i];
        }
    }
    return str[];
    }*/
 /*public static String trimDoubleQuot(String str){//""を削除
        char c='"';
        if(str.charAt(0)==c&&str.charAt(str.length()-1)==c){
            return str.substring(1,str.length()-1);
        }else{
            return str;
        }
    }*/
 /*public static Void trim(String[] Double){
        String emotions[]=new String[100];
        feeling(emotions);
        String Quot[]=new String[100];
        String str="0";
        trimDoubleQuot(str);
        for(int i=0;i<Quot.length;i++){
            Qout[i]=trimDbouleQuot(str);
        }
    }*/
 /*public static void sub(String[][]number){
        String numbers[][]={
        {"0","1","2","3","4","5","6","7","8","9"},
        {"10","11","12","13","14","15","16","17","18","19"},
        {"20","21","22","23","24","25","26","27","28","29"},
        {"30","31","32","33","34","35","36","37","38","39"}, 
        {"40","41","42","43","44","45","46","47","48","49"},
        {"50","51","52","53","54","55","56","57","58","59"},
        {"60","61","62","63","64","65","66","67","68","69"},
        {"70","71","72","73","74","75","76","77","78","79"},
        {"80","81","82","83","84","85","86","87","88","89"},
        {"90","91","92","93","94","95","96","97","98","99"}};
        String emotions[][]=new String[10][10];
        feeling(emotions);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
            emotions[i][j]=numbers[i][j];
            number[i][j]=emotions[i][j];
        }
        }
    }
    /*public static void mission(int[] numbering){
        String number[]=new String[100];
        sub(number);
        int[] num=new int[number.length];
        for(int i=0;i<number.length;i++){
            num[i]=Integer.parseInt(number[i]);
            numbering[i]=num[i];
        }
    }*/
 /*public static void lasthint(String[] hint){
        String lasthintlist[]={
            "○○関係","「全ての可能性を信じ、世の中や人生を良いものと考えること」","病気ないし○○○○の本質を研究する学問の1つが病理学","進んで物事を行おうとする性質","ドイツ語でstolzを意味する",
            "他人を○○する","ドイツ語でPessimismusを意味する","ドイツ語でVerachtungを意味する","他人の出世を○○する","ドイツ語でEmpörungを意味する","ドイツ語でSelbstvorwürfeを意味する",
            "ドイツ語でMisstauenを意味する","ドイツ語でSchamを意味する","ドイツ語でEnttäuschungを意味する","ゲートと呼ばれる存在が○○するとファントムを生み出す","ドイツ語でSentimentalitätを意味する",
            "ドイツ語でEhrfurchtを意味する","ある物事に引き付けられる気持ち","ドイツ語でFreudeを意味する","○○のプロセス","○○○に苛まれる","○○感","ドイツ語でLiebeを意味する","ドイツ語でHoffnungを意味する",
            "ドイツ語でÜberlegenheitを意味する","ドイツ語でSpaβを意味する","おこっていること","悲嘆","ドイツ語でHerzschmerzを意味する","慶び","ドイツ語でFurchtを意味する","年齢的な差異は殆ど無い",
            "同族○○","ドイツ語でErwartungenを意味する","○○度","ドイツ語でEkstaseを意味する","ドイツ語でWachsamkeitを意味する","怒りの段階の1つである","ドイツ語でHassを意味する","ドイツ語でStaunenを意味する",
            "○○心","ドイツ語でBewunderungを意味する","ドイツ語でFriedenを意味する","ドイツ語でInteresseを意味する","むしゃくしゃ","ドイツ語でTraurigkeitを意味する","つまらないこと",
            "ドイツ語でverärgernを意味する","ドイツ語でAngstを意味する","ドイツ語でAnnahmeを意味する","ドイツ語でArroganzを意味する","ドイツ語でWutを意味する","○○の魔女","魔女教大罪司教○○担当",
            "○○の悪魔","ドイツ語でLustを意味する","「他者の苦しみを理解し、その苦しみを和らげることを心から願う感情や態度を指します」","じっと耐え忍ぶこと","たゆまずに一所懸命にあることを続けていく様",
            "○○の王","○○の天使","○○語","スズランの花言葉","人類の○○","「他の存在を憎み、害を加えようとする気持ち」","○○を求める","○○の衝動","人類が○○する","○○的思考","睡蓮の花言葉","○○科高校の劣等生",
            "○○○○○○湧いてきた","「○○○○○を追い求め、創作料理を作ったりしている」","喪失すると忍びとしての資格を失うことと同義である","○○○が創る明日","愛と平和","強き竜の者であるキョウリュウジャーに変身するために必要な力",
            "トッキュウジャーに変身するために必要な力","冗談めかした言動が多いがひょうひょうとした態度の裏側には強く大きな情熱を抱えている","頑張っているさま","「カワイイ」という概念への情景がある",
            "よさがわからないやつはミュートする","演算結果に順応なAI","感情的なさま","本気で対象となる事物を○○○○と思っていない場合に用いる","「本来の意味を超越するほど素晴らしく、他に比べるものがないくらい好きである」",
            "地球の本棚に○○されているもの","○○は巡る","必要悪とは異なる","次世代ガールズ○○○プロジェクト","「○○*アニメ*ゲームでおくる、全く新しいメディアミックスプロジェクトD4○○」",
            "対義語として部品や要素を表す「モジュール」「パーツ」がある","「魔物肉を直接食し、肉体を回復することで取得出来、取得者が出来る項目が増加することで派生として現れる」","からめ手を得意とする隊員が特殊○○が高い",
            "全8種存在する","AI○○ソフトが存在している","○○知識","Remixすれば曲の印象が変わる","○○で唯一の”魂のパートナー”「ソウルバディ」","図説○○文字入門"};
        for (int i = 0;i<lasthintlist.length;i++){
            hint[i]=lasthintlist[i];
        }
    }*/
 /*public static String add(String Emotion){
        int[]numbering=new int[100];
        mission(numbering);
        int[]Addwords=new int[25];
        int m=0;
        while (m<Addwords.length) {
            Addwords[m]=numbering[m];
            switch (Addwords[m]) {
                case 0 :Emotion="Love And Hate";
                break;
                case 1 :Emotion="Optimism "+"(=Anticipation "+"+Joy)";
                break;
                case 2 :Emotion="Morbidness "+"(=Disgust "+"+Joy)";
                break;
                case 3 :Emotion="Aggressiveness "+"(=Anger "+"+Anticipation)";
                break;
                case 4 :Emotion="Pride "+"(=Anger "+"+Joy)";
                break;
                case 5 :Emotion="Cynicism "+"(=Disgust "+"+Anticipation)";
                break;
                case 6 :Emotion="Pessimism "+"(=Sadness "+"+Anticipation)";
                break;
                case 7 :Emotion="Contempt "+"(=Disgust "+"+Anger)";
                break;
                case 8 :Emotion="Envy "+"(=Sadness "+"+Anger)";
                break;
                case 9 :Emotion="Outrage "+"(=Surprise "+"+Anger)";
                break;
                case 10 :Emotion="Remorse "+"(=Sadness "+"+Disgust)";
                break;
                case 11 :Emotion="Unbelief "+"(=Surprise "+"+Disgust)";
                break;
                case 12 :Emotion="Shame "+"(=Fear "+"+Disgust)";
                break;
                case 13 :Emotion="Disappointment "+"(=Surprise "+"+Sadness)";
                break;
                case 14 :Emotion="Despair "+"(=Fear "+"+Sadness)";
                break;
                case 15 :Emotion="Sentimentality "+"(=Trust "+"+Sadness)";
                break;
                case 16 :Emotion="Awe "+"(=Fear "+"+Surprise)";
                break;
                case 17 :Emotion="Curiosity "+"(=Trust "+"+Surprise)";
                break;
                case 18 :Emotion="Delight "+"(=Joy "+"+Surprise)";
                break;
                case 19 :Emotion="Submission "+"(=Trust "+"+Fear)";
                break;
                case 20 :Emotion="Guilt "+"(=Joy "+"+Fear)";
                break;
                case 21 :Emotion="Anxiety "+"(=Anticipation "+"+Fear)";
                break;
                case 22 :Emotion="Love "+"(=Joy "+"+Trust)";
                break;
                case 23 :Emotion="Hope "+"(=Anticipation "+"+Trust)";
                break;
                case 24 :Emotion="Dominance "+"(=Anger "+"+Trust)";
                break;
                default :Emotion="null";
                break;
            }
            m++;
        }
        return Emotion;
    }*/
 /*public static String pull(String Decrease){
        int[]numbering=new int[100];
        mission(numbering);
        int[]Decreasewords=new int[50];
        int n=25;
        while (n<Decreasewords.length) {
            Decreasewords[n]=numbering[n];
            switch (Decreasewords[n]) {
                case 25 :Decrease ="Enjoy "+"(=joy, anger, sadness, Enjoy "+"-joy "+"-anger "+"-sadness)";
                break;
                case 26 :Decrease ="Anger "+"(=Happy laughing angry cursing "+"-happy "+"-laugh "+"-curse)";
                break;
                case 27 :Decrease ="Sad "+"(=grieving parents "+"-A sad one "+"-father "+"-mother)";
                break;
                case 28 :Decrease ="Grief "+"(=separation pain "+"-Love "+"-break up "+"-Leave)";
                break;
                case 29 :Decrease ="Joy "+"(=Crazy dance "+"-go crazy "+"-be disturbed "+"-dance)";
                break;
                case 30 :Decrease ="Fear "+"(=I apologize for the inconvenience "+"-one fear "+"-Greetings)";
                break;
                case 31 :Decrease ="Surprise "+"(=Shocking heart "+"-heart "+"-move "+"-spirit)";
                break;
                case 32 :Decrease ="Disgust "+"(=self hate "+"-self)";
                break;
                case 33 :Decrease ="Anticipation "+"(=Expected value "+"-value)";
                break;
                case 34 :Decrease ="Trust "+"(=Confidence growth curve "+"-degree "+"-growth curve)";
                break;
                case 35 :Decrease ="Ecstasy "+"(=ecstatic person "+"-of "+"-person)";
                break;
                case 36 :Decrease ="Vigilance "+"(=restricted area "+"-area)";
                break;
                case 37 :Decrease ="Rage "+"(=rage syndrome "+"-syndrome)";
                break;
                case 38 :Decrease ="Loathing "+"(=thoughts of hatred "+"-of "+"-Thought)";
                break;
                case 39 :Decrease ="Amazement "+"(=amazing "+"-to "+"-worthy)";
                break;
                case 40 :Decrease ="Terror "+"(=Be afraid! "+"-do "+"-!)";
                break;
                case 41 :Decrease ="Admiration "+"(=Exclamation point "+"-sign)";
                break;
                case 42 :Decrease ="Serenity "+"(=Peaceful and safe "+"-safely)";
                break;
                case 43 :Decrease ="Interest "+"(=Interesting "+"-all over)";
                break;
                case 44 :Decrease ="Annoyance "+"(=complicated world "+"-rough "+"-world)";
                break;
                case 45 :Decrease ="Pensiveness "+"(=gloomy future "+"-Depressed "+"-future)";
                break;
                case 46 :Decrease ="Boredom "+"(=boredom psychology "+"-psychoygy)";
                break;
                case 47 :Decrease ="Distraction "+"(=agitated gait "+"-gender "+"-walking)";
                break;
                case 48 :Decrease ="Apprehension "+"(=Anxiety "+"-case)";
                break;
                case 49 :Decrease ="Acceptance "+"(acceptable pronunciation "+"-pronunciation)";
                break;
                default :Decrease ="null";
                break;
            }
            n++;
        }
        return Decrease;
    }*/
 /*public static String Squared(String Deadlysins){
        int[]numbering=new int[100];
        mission(numbering);
        int[]Deadlysinswords=new int[56];
        int o=50;
        while (o<Deadlysinswords.length) {
            Deadlysinswords[o]=numbering[o];
            switch (Deadlysinswords[o]) {
                case 50 :Deadlysins ="Arrogance "+"(=be laughed at* "+"Complex)";
                break;
                case 51 :Deadlysins ="Wrath "+"(=Reason disappears* "+"Instinctive massacre)";
                break;
                case 52 :Deadlysins ="Lazy "+"(=The neighborhood large consumption* "+"Self efficiency)";
                break;
                case 53 :Deadlysins ="Greed "+"(=I plunder the killing partner of it partly at random* "+"The greed that is not satisfied)";
                break;
                case 54 :Deadlysins ="Gluttony "+"(=I can eat it targeting at every thing* "+"Eternity hunger)";
                break;
                case 55 :Deadlysins ="Lust "+"(=I give state abnormality of the \"hypnosis\" \"charm\" \"brainwashing\" to a partner* "+"Intense loathsomeness)";
                break;
                default :Deadlysins ="null";
                break;
            }
            o++;
        }
        return Deadlysins;
    }*/
 /*public static String Multiplicationdivision(String Virtues){
        int[]numbering=new int[100];
        mission(numbering);
        int[]Virtueswords=new int[64];
        int p=56;
        while (p<Virtueswords.length) {
            Virtueswords[p]=numbering[p];
            switch (Virtueswords[p]) {
                case 56 :Virtues ="Mercy "+"(=resurrection of the dead* "+"Taboo"+"/self)";
                break;
                case 57 :Virtues ="Patience "+"(=death avoidance* " +"Defense/resistance ability increase and resistance proficiency correction* "+"Resistance proficiency correction "+"/Patience)";
                break;
                case 58 :Virtues ="Diligence "+"(=Erosion takeover to move the soul* "+"half immortal "+"/the will of others)";
                break;
                case 59 :Virtues ="Relief "+"(=Super fast recovery of physical strength to self and allies* "+"donation "+"/stock)";
                break;
                case 60 :Virtues ="Temperance "+"(=Reincarnation with memory of previous life retained* "+"Practically immortal "+"/fraud)";
                break;
                case 61 :Virtues ="Humility "+"(=Consume your soul to gain power equal to that of a god* "+"equal position "+"/Discomfort)";
                break;
                case 62 :Virtues ="Purity "+"(=Expand your own divine realm* "+"develop a powerful barrier "+"/sexual relationship)";
                break;
                case 63 :Virtues ="Wisdom "+"(=View all information* "+"mapping* "+"tracking* "+"The height of magic* "+"Star demon "+"/rejection)";
                break;
                default :Virtues ="null";
                break;
            }
            p++;
        }
        return Virtues;
    }*/
 /*public static String arithmeticoperation(String Perfectconclusion){
        int[]numbering=new int[100];
        mission(numbering);
        int[]Perfectconclusionwords=new int[70];
        int q=64;
        while (q<Perfectconclusionwords.length) {
            Perfectconclusionwords[q]=numbering[q];
            switch (Perfectconclusionwords[q]) {
                case 64 :Perfectconclusion ="Malice "+"(=deep sorrow* "+"hatred "+"%It is every feeling except one)";
                break;
                case 65 :Perfectconclusion ="Struggle "+"(=The ceremony that it spoils* "+"Hidden fighting instinct "+"%It doesn't matter if it's exactly the same)";
                break;
                case 66 :Perfectconclusion ="Intention to kill "+"(=As for the love and the desire among oneself* "+"Existence not to be able to notice declares it "+"→I can look for it in a heart)";
                break;
                case 67 :Perfectconclusion ="Extinction "+"Decrease in individuals* "+"cease to exist from the stars "+"→balance is damaged";
                break;
                case 68 :Perfectconclusion ="Catastrophe "+"(=flag to die* "+"growing fast and slow "+"→beyond creation";
                break;
                case 69 :Perfectconclusion ="Destruction "+"(=suffer catastrophic damage* "+"The fate I lost "+"→want to avoid";
                break;
                default :Perfectconclusion ="null";
                break;
            }
            q++;
        }
        return Perfectconclusion;
    }*/
 /*public static String conversion(String Changefullthrottle){
        int numbering[]=new int[100];
        mission(numbering);
        int[]Changefullthrottlewords=new int[numbering.length];
        int r=70;
        while(r<Changefullthrottlewords.length){
            Changefullthrottlewords[r]=numbering[r];
            switch (Changefullthrottlewords[r]) {
                case 70 :Changefullthrottle = "Magic "+"(=It's holy power, it's an adventure into the unknown, and it's a proof of courage.)";
                break;
                case 71 :Changefullthrottle = "Chiramental "+"(=shining spirit)";
                break;
                case 72:Changefullthrottle = "Gotcha "+"(=something just for me)";
                break;
                case 73 :Changefullthrottle = "Shinobi Tality "+"(=Mental strength, such as the way each person's heart and spirit is held toward ninjas)";
                break;
                case 74 :Changefullthrottle = "Build "+"(=Create, form)";
                break;
                case 75 :Changefullthrottle = "Love and peace " +"(=love & peace)";
                break;
                case 76 :Changefullthrottle = "Brave "+"(=``Not only 'brave', but also the power of the heart that was not present on the destroyed asteroid, and is said to be the human spirit that burns together and overcomes despair.'')";
                break;
                case 77 :Changefullthrottle = "Imagination "+"(=imagination)";
                break;
                case 78 :Changefullthrottle = "It's mocha "+"(=go at your own pace)";
                break;
                case 79 :Changefullthrottle = "I'm confused "+"(=doing my best)";
                break;
                case 80 :Changefullthrottle = "Noah is here "+"(=It's like you don't have an eye for cute things)";
                break;
                case 81 :Changefullthrottle = "be disgusted with "+"(=So that I behave like a baby to a partner detecting oneself, but guard is firm for the partner who is not so)";
                break;
                case 82 :Changefullthrottle = "luminous "+"(=The way an AI (machine people) with emotions behaves like an AI (machine people) without emotions.)";
                break;
                case 83 :Changefullthrottle = "Emotional "+"(=What an indescribably wonderful feeling!)";
                break;
                case 84 :Changefullthrottle = "Cute "+"(=Feeling attracted to small and weak things)";
                break;
                case 85 :Changefullthrottle = "precious "+"(=wonderful, the best)";
                break;
                case 86 :Changefullthrottle = "Memory "+"(=Something created by the overlap of time, a specific event)";
                break;
                case 87 :Changefullthrottle = "justice "+"(=embodiment of the ideal,hypocrisy,correct reason, a righteous principle that exists as many as there are)";
                break;
                case 88 :Changefullthrottle = "absolute evil "+"(=Names, society, and civilization will all be reduced to nothing.)";
                break;
                case 89 :Changefullthrottle = "Band "+"(=Common destiny)";
                break;
                case 90 :Changefullthrottle = "DJ "+"(=``The person who selects and plays records at dance clubs and discos'', the person who connects existence and music.)";
                break;
                case 91 :Changefullthrottle = "System "+"(=An organization or system in which many elements come together in a cohesive manner.)";
                break;
                case 92 :Changefullthrottle = "Skill "+"(=Ability related to changing jobs as a very rare “talent”)";
                break;
                case 93 :Changefullthrottle = "Technology "+"(=Accuracy and precision of attack and defense)";
                break;
                case 94 :Changefullthrottle = "Sacred art "+"(=It has 8 different strains and consumes divine power.)";
                break;
                case 95 :Changefullthrottle = "Singing "+"(=singing a song)";
                break;
                case 96 :Changefullthrottle = "Science "+"(=Steady efforts to find rules for things we don't understand)";
                break;
                case 97 :Changefullthrottle = "Music "+"(=Art by sound, instrumental music and vocal music, something that releases the power hidden in humans.)";
                break;
                case 98 :Changefullthrottle = "Universe "+"(=The entire space and time, a space that extends forward, backward, left, right, up and down, and time that extends from the past to the future.``Every time the song changes due to synesthesia, the sound of the entire venue and the color of people's feelings change.'')";
                break;
                case 99 :Changefullthrottle = "Age of gods "+"(=An era in which there were gods in the lower world, showing the name of the magic known as Logic that twisted the principles of the stars.)";
                break;
                default :Changefullthrottle = "null";
                break;
            }
            r++;
        }
        return Changefullthrottle;
    }*/
 /*public static String scanaria(String l){
    java.util.Scanner scanner=new java.util.Scanner(System.in);
    String scan=scanner.nextLine();
     //System.out.println(line);
     l=scan;
    //l=String.join("",scan);
    //System.out.println(l);
    return l;
    }
    /*public static int scanaria(int l){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        int a=scanner.nextInt();
        l=a;
        return l;
    }*/
 /*private static int[] scanNumbers() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
            String line=scanner.nextLine();
            String[] values=line.split(",",10); 
                int[] numbers=new int[values.length];
            //System.out.println(line);
            for(int i=0;i<values.length;i++){
                try {
                    numbers[i]=Integer.parseInt(values[i]);
                } catch (NumberFormatException ex) {
                    return null;
                }
            }
            return numbers;
        
        while(true){
            //String input = scanner.nextLine();
            l=scan;
            String errorMessage = InputChecker.l(scan);
    // この部分を追加しました。↓
    if (errorMessage != null) {
        System.out.println(errorMessage);
        continue;
    }
    if (scan.equals("q")) {
        System.out.println("強制終了します");
        break;}
        }
        }*/
 /*public static void main(String[] args) throws Exception {
        //String emotions[]=new String[100];
        /*String number[]=new String[100];
        sub(number);*/
//feeling(emotions);
//System.out.println("感情を含む用語一覧: ");
/*String emos[][]=new String [13][8];
        for (int j=0;j<13;j++) {
        for(int i=0;i<8;i++){
        emos[j][i]=emotions[i];
            System.out.print(" "+emos[j][i]+" ");
        }
        }*/
 /*for(String x:emotions){
            System.out.println("感情を含む用語一覧:"+x);
        }*/
 /*for(Map.Entry<String,String>entry:MAP.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue() );
        }*/
 /*System.out.println(MAP.size());
        System.out.println(EXMAP.size());*/
 /*for(int i=0;i<number.length;i++){
            System.out.println("感情を含む用語一覧:"+emotions[i]+":"+number[i]);
        }*/
 /*int[] numbers;
        numbers=scanNumbers();
        if(null==numbers){
            return;
        }*/
 /*String l="0";
scanaria(l);*/
 /*java.util.Scanner scanner=new java.util.Scanner(System.in);
    String scan=scanner.nextLine();*/
 /*Map<String,String>exMap=new HashMap<>();
    for(int i=0;i<100;i++){
    exMap.put(scanaria(l),number[i]);
    }*/
 /*for(int i=0;i<100;i++){
        exMap.put(scan,number[i]);
    }*/
 /*for(Map.Entry<String,String>entry:EXMAP.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
        String add="1";
            addaria(add);
            String pull="2";
            pullaria(pull);
            String Squared="3";
            Squaredaria(Squared);
            String Multiplicationdivision="4";
            Multiplicationdivisionaria(Multiplicationdivision);
            String arithmeticoperation="5";
            arithmeticoperationaria(arithmeticoperation);
            String conversion="6";
            conversionaria(conversion);
            System.out.println("ゲームを終了します");
        }
    public static void addaria(String add){
        System.out.println("加算エリア");
        String emotions[][]=new String[10][10];
        String number[][]=new String[10][10];
        sub(number);
        feeling(emotions);
        String emo[]={"愛憎","楽観","病的状態","積極性","誇り","冷笑","悲観","軽蔑",
        "嫉妬","憤慨","自責","不信","恥","失望","絶望","感傷",
        "畏敬","好奇心","歓喜","服従","罪悪感","不安","愛","希望",
        "優位","楽しい","怒り","悲しみ","悲痛","喜び","恐れ","驚き",
        "嫌悪","期待","信頼","恍惚","警戒","激怒","憎悪","驚嘆",
        "恐怖","感嘆","平穏","興味","煩さ","憂い","退屈","動揺",
        "心配","容認","傲慢","憤怒","怠惰","強欲","暴食","色欲",
        "慈悲","忍耐","勤勉","救恤","節制","謙譲","純潔","叡智",
        "悪意","闘争","殺意","絶滅","破滅","滅亡","魔法","キラメンタル",
        "ガッチャ！","忍タリティ","ビルド","ラブ＆ピース","ブレイブ","イマジネーション","モカってる","ツグってる",
        "ノアってる","むにってる","ルミナってる","エモい","可愛い","尊い","記憶","正義",
        "絶対悪","バンド","DJ","システム","技能","技術","神聖術","歌唱",
        "科学","音楽","宇宙","神代"};
        String numbers[]={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
        "20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39", 
        "40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59",
        "60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79",
        "80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99"};
        //String x;
        /*String str;
        char co='"';*/
 /*String l="0";
scanaria(l);
        int c=0;
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);*/
//String hint[]=new String[100];
//lasthint(hint);
/*while(c<2){
            int y=new java.util.Random().nextInt(25);
            c++;
            switch (y) {
                case 0 :{
                    System.out.println("愛と憎しみを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[0];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                             x.substring(1,x.length()-1);
                             str=x;
                        }else{
                            str=x;
                        }
                        if(Emotion.equals(str)){
                            System.out.println("正解"+emotions[0]);
                        }*/
//System.out.println(Emotion);
//System.out.println(x);
/*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[0] == null : scanaria(l).equals(number[0])){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }*/
 /*if(MAP.containsKey("愛憎")&&(EXMAP.containsKey("0"))){
                        if(MAP.get("愛憎").equals(EXMAP.get("0"))){
                            System.out.println("正解:"+emo[0]);
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情、基本感情、強い感情、弱い感情のどれにも位置しない」");
                                break;
                                case 1 : System.out.println("ヒント:反対の語句が並んでいる");
                                break;
                                case 2 : System.out.println("ヒント:○○の念が入り混じる");
                                break;
                                case 3 : System.out.println("ヒント:○○相半ばする");
                                break;
                                case 4 : System.out.println("ヒント:特に相手に対して好悪の感情を抱くこと");
                                break;
                                case 5 : System.out.println("ヒント:一組の存在達の間に生じる全く対照的な感情");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":Love And Hate"ヒント:○○関係);
                                break;
                            }
                        }
                    }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("○○関係")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("期待と喜びを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[1];*/
//System.out.println(Emotion);
//System.out.println(x);
/*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                             x.substring(1,x.length()-1);
                             str=x;
                        }else{
                            str=x;
                        }
                        if(Emotion.equals(str)){
                            System.out.println("正解"+emotions[1]);
                        }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[1]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[1] == null : scanaria(l).equals(number[1])){
                            System.out.println("正解:"+emotions[1]);
                            break;
                        }*/
 /*if(MAP.equals(EXMAP)){
                            System.out.println("正解:"+emo[1]);
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:世界を軽く考えている");
                                break;
                                case 2 : System.out.println("ヒント:物事の先行きを良い方に考えて心配しない事");
                                break;
                                case 3 : System.out.println("ヒント:心配するほどのことではないとして気楽に考えること");
                                break;
                                case 4 : System.out.println("ヒント:病状は○○を許さない");
                                break;
                                case 5 : System.out.println("ヒント:状況を○○する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[1]+":Optimism \"+\"(=Anticipation \"+\"+Joy)"/*ヒント:「全ての可能性を信じ、世の中や人生を良いものと考えること」);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("「全ての可能性を信じ、世の中や人生を良いものと考えること」")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    } 
                };
                break;
                case 2 :{
                    System.out.println("嫌悪と喜びを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[2];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[2]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[2]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[2] == null : scanaria(l).equals(number[2])){
                            System.out.println("正解:"+emotions[2]);
                            break;
                        }
                        if(MAP.equals(EXMAP)){
                            System.out.println("正解:"+emo[2]);
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:矛盾している状態");
                                break;
                                case 2 : System.out.println("ヒント:「無能感が個人を圧倒し、有益な活動へ刺激するどころか、人を落ち込ませ、成長出来ないときの劣等感」");
                                break;
                                case 3 : System.out.println("ヒント:認知症が含まれる");
                                break;
                                case 4 : System.out.println("ヒント:病識とは患者自身が○○○○にあると自覚する事");
                                break;
                                case 5 : System.out.println("ヒント:過剰なストレス刺激は精神的な○○○○の原因となる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[2]+":Morbidness \"+\"(=Disgust \"+\"+Joy)"/*ヒント:病気ないし○○○○の本質を研究する学問の1つが病理学);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("病気ないし○○○○の本質を研究する学問の1つが病理学")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("怒りと期待を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                    /*String Emotion=scanaria(l);
                        x=emotions[3];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[3]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[3]);
                            break;
                        }*/
 /*f(scanaria(l) == null ? number[3] == null : scanaria(l).equals(number[3])){
                            System.out.println("正解:"+emotions[3]);
                            break;
                        }
                        if(MAP.equals(EXMAP)){
                            System.out.println("正解:"+emo[3]);
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:自発的に動くこと");
                                break;
                                case 2 : System.out.println("ヒント:物事に対して能動的に行動する姿勢");
                                break;
                                case 3 : System.out.println("ヒント:○○○を養う");
                                break;
                                case 4 : System.out.println("ヒント:○○○のある人");
                                break;
                                case 5 : System.out.println("ヒント:賢明な○○○");
                                break;
                                case 6 : System.out.println("gameover"+emotions[3]+":Aggressiveness \"+\"(=Anger \"+\"+Anticipation)"/*ヒント:進んで物事を行おうとする性質);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("進んで物事を行おうとする性質")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("怒りと喜びを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[4];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[4]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[4]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[4] == null : scanaria(l).equals(number[4])){
                            System.out.println("正解:"+emotions[4]);
                            break;
                        }
                        if(MAP.get(emo[4]).equals(EXMAP.get(numbers[4]))){
                            System.out.println("正解:"+MAP.get(emo[4]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:自信を持っている");
                                break;
                                case 2 : System.out.println("ヒント:みずからそれを名誉とする感情");
                                break;
                                case 3 : System.out.println("ヒント:一家の○○");
                                break;
                                case 4 : System.out.println("ヒント:○○を傷つけられる");
                                break;
                                case 5 : System.out.println("ヒント:○○を尊重する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[4]+":Pride \"+\"(=Anger \"+\"+Joy)"/*ヒント:ドイツ語でstolzを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でstolzを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("嫌悪と期待を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[5];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[0]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[5]);
                        break;
                        }*/
 /*if(scanaria(l) == null ? number[5] == null : scanaria(l).equals(number[5])){
                            System.out.println("正解:"+emotions[5]);
                            break;
                        }
                        if(MAP.get(emo[5]).equals(EXMAP.get(numbers[5]))){
                            System.out.println("正解:"+MAP.get(emo[5]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:さげすみ見下した態度で見ること");
                                break;
                                case 2 : System.out.println("ヒント:「さげすみ、みくだした態度で笑う事」");
                                break;
                                case 3 : System.out.println("ヒント:あざわらうこと");
                                break;
                                case 4 : System.out.println("ヒント:○○主義");
                                break;
                                case 5 : System.out.println("ヒント:○○を浮かべる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[5]+":Cynicism \"+\"(=Disgust \"+\"+Anticipation)"/*ヒント:他人を○○する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("他人を○○する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 6 :{
                    System.out.println("悲しみと期待を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[6];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[6]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[6]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[6] == null : scanaria(l).equals(number[6])){
                            System.out.println("正解:"+emotions[6]);
                            break;
                        }
                        if(MAP.get(emo[6]).equals(EXMAP.get(numbers[6]))){
                            System.out.println("正解:"+MAP.get(emo[6]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:事態を暗い向きに見ること");
                                break;
                                case 2 : System.out.println("ヒント:好ましい状態にならないだろうと前途を悲しんで考えること");
                                break;
                                case 3 : System.out.println("ヒント:「人生・世界・宇宙は苦しみや悪ばかりだとする、物の見方」");
                                break;
                                case 4 : System.out.println("ヒント:先行きに望みは無いと考えるさま");
                                break;
                                case 5 : System.out.println("ヒント:望みの持てないさま");
                                break;
                                case 6 : System.out.println("gameover"+emotions[6]+":Pessimism \"+\"(=Sadness \"+\"+Anticipation)"/*ヒント:ドイツ語でPessimismusを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でPessimismusを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 7 :{
                    System.out.println("嫌悪と怒りを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[7];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[7]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[7]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[7] == null : scanaria(l).equals(number[7])){
                            System.out.println("正解:"+emotions[7]);
                            break;
                        }
                        if(MAP.get(emo[7]).equals(EXMAP.get(numbers[7]))){
                            System.out.println("正解:"+MAP.get(emo[7]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:馬鹿にすること");
                                break;
                                case 2 : System.out.println("ヒント:かろんじさげすむこと");
                                break;
                                case 3 : System.out.println("ヒント:「いやしい、劣っている、つまらないなどと感じて馬鹿にすること」");
                                break;
                                case 4 : System.out.println("ヒント:かるくみてあなどること");
                                break;
                                case 5 : System.out.println("ヒント:見下げること");
                                break;
                                case 6 : System.out.println("gameover"+emotions[7]+":Contempt \"+\"(=Disgust \"+\"+Anger)"/*ヒント:ドイツ語でVerachtungを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でVerachtungを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 8 :{
                    System.out.println("悲しみと怒りを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[8];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[8]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[8]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[8] == null : scanaria(l).equals(number[8])){
                            System.out.println("正解:"+emotions[8]);
                            break;
                        }
                        if(MAP.get(emo[8]).equals(EXMAP.get(numbers[8]))){
                            System.out.println("正解:"+MAP.get(emo[8]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情及び七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:相手のスキルを強制的に使用不能（封印）することが出来るが、感情の抑制が効きにくくなってしまう");
                                break;
                                case 2 : System.out.println("ヒント:相手を愛する反動");
                                break;
                                case 3 : System.out.println("ヒント:「独占欲を満たせないときに瞬時に生まれる、消しがたい感情」");
                                break;
                                case 4 : System.out.println("ヒント:SNSでの「いいね!」の裏の感情");
                                break;
                                case 5 : System.out.println("ヒント:自分より優れた者を羨んだり、妬んだりすること");
                                break;
                                case 6 : System.out.println("gameover"+emotions[8]+":Envy \"+\"(=Sadness \"+\"+Anger)"/*ヒント:他人の出世を○○する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("他人の出世を○○する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 9 :{
                    System.out.println("驚きと怒りを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[9];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[9]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[9]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[9] == null : scanaria(l).equals(number[9])){
                            System.out.println("正解:"+emotions[9]);
                            break;
                        }
                        if(MAP.get(emo[9]).equals(EXMAP.get(numbers[9]))){
                            System.out.println("正解:"+MAP.get(emo[9]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:酷く腹を立てること");
                                break;
                                case 2 : System.out.println("ヒント:けしからぬ事に対していきどおりなげくこと");
                                break;
                                case 3 : System.out.println("ヒント:身勝手な振る舞いに○○する");
                                break;
                                case 4 : System.out.println("ヒント:涼宮ハルヒの○○");
                                break;
                                case 5 : System.out.println("ヒント:非常に腹を立てている様子");
                                break;
                                case 6 : System.out.println("gameover"+emotions[9]+":Outrage \"+\"(=Surprise \"+\"+Anger)"/*ヒント:ドイツ語でEmpörungを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でEmpörungを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 10 :{
                    System.out.println("悲しみと嫌悪を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[10];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[10]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[10]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[10] == null : scanaria(l).equals(number[10])){
                            System.out.println("正解:"+emotions[10]);
                            break;
                        }
                        if(MAP.get(emo[10]).equals(EXMAP.get(numbers[10]))){
                            System.out.println("正解:"+MAP.get(emo[10]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:自分で自分の過ちを責めること");
                                break;
                                case 2 : System.out.println("ヒント:○○思考");
                                break;
                                case 3 : System.out.println("ヒント:○○の念に駆られる");
                                break;
                                case 4 : System.out.println("ヒント:○○点");
                                break;
                                case 5 : System.out.println("ヒント:過度な○○思考は鬱の原因");
                                break;
                                case 6 : System.out.println("gameover"+emotions[10]+":Remorse \"+\"(=Sadness \"+\"+Disgust)"/*ヒント:ドイツ語でSelbstvorwürfeを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でSelbstvorwürfeを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 11 :{
                    System.out.println("驚きと嫌悪を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[11];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[11]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[11]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[11] == null : scanaria(l).equals(number[11])){
                            System.out.println("正解:"+emotions[11]);
                            break;
                        }
                        if(MAP.get(emo[11]).equals(EXMAP.get(numbers[11]))){
                            System.out.println("正解:"+MAP.get(emo[11]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:信用しない事");
                                break;
                                case 2 : System.out.println("ヒント:信義がない事");
                                break;
                                case 3 : System.out.println("ヒント:不実");
                                break;
                                case 4 : System.out.println("ヒント:○○の念を抱く");
                                break;
                                case 5 : System.out.println("ヒント:信仰心のない事");
                                break;
                                case 6 : System.out.println("gameover"+emotions[11]+":Unbelief \"+\"(=Surprise \"+\"+Disgust)"/*ヒント:ドイツ語でMisstauenを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でMisstauenを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 12 :{
                    System.out.println("恐れと嫌悪を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[12];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[12]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[12]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[12] == null : scanaria(l).equals(number[12])){
                            System.out.println("正解:"+emotions[12]);
                            break;
                        }
                        if(MAP.get(emo[12]).equals(EXMAP.get(numbers[12]))){
                            System.out.println("正解:"+MAP.get(emo[12]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:きまり悪く思う");
                                break;
                                case 2 : System.out.println("ヒント:はずかしく思う");
                                break;
                                case 3 : System.out.println("ヒント:世の人に対し面目・名誉を失う事");
                                break;
                                case 4 : System.out.println("ヒント:はずべき事柄をはずかしいと思う存在らしい心");
                                break;
                                case 5 : System.out.println("ヒント:○○を忍んでお願いする");
                                break;
                                case 6 : System.out.println("gameover"+emotions[12]+":Shame \"+\"(=Fear \"+\"+Disgust)"/*ヒント:ドイツ語でSchamを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でSchamを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 13 :{
                    System.out.println("驚きと悲しみを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[13];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[13]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[13]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[13] == null : scanaria(l).equals(number[13])){
                            System.out.println("正解:"+emotions[13]);
                            break;
                        }
                        if(MAP.get(emo[13]).equals(EXMAP.get(numbers[13]))){
                            System.out.println("正解:"+MAP.get(emo[13]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:とある都市の最高戦力の成長が想定よりも低かった");
                                break;
                                case 2 : System.out.println("ヒント:のぞみをうしなうこと");
                                break;
                                case 3 : System.out.println("ヒント:あてがはずれてがっかりすること");
                                break;
                                case 4 : System.out.println("ヒント:期待や希望が外れた時の気持ちが沈むさま");
                                break;
                                case 5 : System.out.println("ヒント:○○落胆");
                                break;
                                case 6 : System.out.println("gameover"+emotions[13]+":Disappointment \"+\"(=Surprise \"+\"+Sadness)"/*ヒント:ドイツ語でEnttäuschungを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でEnttäuschungを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 14 :{
                    System.out.println("恐れと悲しみを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[14];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[14]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[14]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[14] == null : scanaria(l).equals(number[14])){
                            System.out.println("正解:"+emotions[14]);
                            break;
                        }
                        if(MAP.get(emo[14]).equals(EXMAP.get(numbers[14]))){
                            System.out.println("正解:"+MAP.get(emo[14]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情及び負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:抗う英雄が産まれる土壌を作るための世界の状況");
                                break;
                                case 2 : System.out.println("ヒント:「ある不在の全を獲得し、或いは現存する悪を排除する可能性がまったくなくなった場合の精神状態」");
                                break;
                                case 3 : System.out.println("ヒント:希望のない様子");
                                break;
                                case 4 : System.out.println("ヒント:ピンチはチャンス");
                                break;
                                case 5 : System.out.println("ヒント:望みが絶たれた状態");
                                break;
                                case 6 : System.out.println("gameover"+emotions[14]+":Despair \"+\"(=Fear \"+\"+Sadness)"/*ヒント:ゲートと呼ばれる存在が○○するとファントムを生み出す);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ゲートと呼ばれる存在が○○するとファントムを生み出す")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 15 :{
                    System.out.println("信頼と悲しみを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[15];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[15]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[15]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[15] == null : scanaria(l).equals(number[15])){
                            System.out.println("正解:"+emotions[15]);
                            break;
                        }
                        if(MAP.get(emo[15]).equals(EXMAP.get(numbers[15]))){
                            System.out.println("正解:"+MAP.get(emo[15]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:ものに感じて心を痛めること");
                                break;
                                case 2 : System.out.println("ヒント:「そう思うと、なんだか○○の情に堪えない」");
                                break;
                                case 3 : System.out.println("ヒント:「物事に感じやすく、すぐ悲しんだり同情したりする心の傾向」");
                                break;
                                case 4 : System.out.println("ヒント:○○に浸る");
                                break;
                                case 5 : System.out.println("ヒント:○○的");
                                break;
                                case 6 : System.out.println("gameover"+emotions[15]+":Sentimentality \"+\"(=Trust \"+\"+Sadness)"/*ヒント:ドイツ語でSentimentalitätを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でSentimentalitätを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 16 :{
                    System.out.println("恐れと驚きを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[16];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[16]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[16]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[16] == null : scanaria(l).equals(number[16])){
                            System.out.println("正解:"+emotions[16]);
                            break;
                        }
                        if(MAP.get(emo[16]).equals(EXMAP.get(numbers[16]))){
                            System.out.println("正解:"+MAP.get(emo[16]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:心から服しうやまうこと");
                                break;
                                case 2 : System.out.println("ヒント:崇高なものや偉大な人をおそれうやまうこと");
                                break;
                                case 3 : System.out.println("ヒント:○○の念を抱く");
                                break;
                                case 4 : System.out.println("ヒント:○○する");
                                break;
                                case 5 : System.out.println("ヒント:○○の念に打たれる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[16]+":Awe \"+\"(=Fear \"+\"+Surprise)"/*ヒント:ドイツ語でEhrfurchtを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でEhrfurchtを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 17 :{
                    System.out.println("信頼と驚きを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[17];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[17]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[17]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[17] == null : scanaria(l).equals(number[17])){
                            System.out.println("正解:"+emotions[17]);
                            break;
                        }
                        if(MAP.get(emo[17]).equals(EXMAP.get(numbers[17]))){
                            System.out.println("正解:"+MAP.get(emo[17]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:珍しいものや自分の知らないものに興味を持つ心");
                                break;
                                case 2 : System.out.println("ヒント:奇なるものを好む心");
                                break;
                                case 3 : System.out.println("ヒント:○○○旺盛");
                                break;
                                case 4 : System.out.println("ヒント:生得的なもの");
                                break;
                                case 5 : System.out.println("ヒント:物事を探究しようとする根源的な心");
                                break;
                                case 6 : System.out.println("gameover"+emotions[17]+":Curiosity \"+\"(=Trust \"+\"+Surprise)"/*ヒント:ある物事に引き付けられる気持ち);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ある物事に引き付けられる気持ち")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 18 :{
                    System.out.println("喜びと驚きを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[18];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[18]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[18]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[18] == null : scanaria(l).equals(number[18])){
                            System.out.println("正解:"+emotions[18]);
                            break;
                        }
                        if(MAP.get(emo[18]).equals(EXMAP.get(numbers[18]))){
                            System.out.println("正解:"+MAP.get(emo[18]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:非常に喜ぶこと");
                                break;
                                case 2 : System.out.println("ヒント:よろこび");
                                break;
                                case 3 : System.out.println("ヒント:○○の声");
                                break;
                                case 4 : System.out.println("ヒント:心からの喜び");
                                break;
                                case 5 : System.out.println("ヒント:心が滾る");
                                break;
                                case 6 : System.out.println("gameover"+emotions[18]+":Delight \"+\"(=Joy \"+\"+Surprise)"/*ヒント:ドイツ語でFreudeを意味す);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でFreudeを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 19 :{
                    System.out.println("信頼と恐れを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[19];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[19]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[19]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[19] == null : scanaria(l).equals(number[19])){
                            System.out.println("正解:"+emotions[19]);
                            break;
                        }
                        if(MAP.get(emo[19]).equals(EXMAP.get(numbers[19]))){
                            System.out.println("正解:"+MAP.get(emo[19]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:大人しくして他人の命令や意志に従う事");
                                break;
                                case 2 : System.out.println("ヒント:絶対○○");
                                break;
                                case 3 : System.out.println("ヒント:○○の心理");
                                break;
                                case 4 : System.out.println("ヒント:○○する");
                                break;
                                case 5 : System.out.println("ヒント:他に従う事");
                                break;
                                case 6 : System.out.println("gameover"+emotions[19]+":Submission \"+\"(=Trust \"+\"+Fear)"/*ヒント:○○のプロセス);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("○○のプロセス")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 20 :{
                    System.out.println("喜びと恐れを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[20];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[0]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[20]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[20] == null : scanaria(l).equals(number[20])){
                            System.out.println("正解:"+emotions[20]);
                            break;
                        }
                        if(MAP.get(emo[20]).equals(EXMAP.get(numbers[20]))){
                            System.out.println("正解:"+MAP.get(emo[20]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:社会的、道徳的に非難されるべきことを犯したという意識ないしは感情");
                                break;
                                case 2 : System.out.println("ヒント:自身がした行為をざいあくと感じる気持ち");
                                break;
                                case 3 : System.out.println("ヒント:○○○を抱く");
                                break;
                                case 4 : System.out.println("ヒント:○○○を消す");
                                break;
                                case 5 : System.out.println("ヒント:不道徳な行いに伴う恥の気持ち");
                                break;
                                case 6 : System.out.println("gameover"+emotions[20]+":Guilt \"+\"(=Joy \"+\"+Fear)"/*ヒント:○○○に苛まれる);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("○○○に苛まれる")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 21 :{
                    System.out.println("期待と恐れを合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[21];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[0]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[21]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[21] == null : scanaria(l).equals(number[21])){
                            System.out.println("正解:"+emotions[21]);
                            break;
                        }
                        if(MAP.get(emo[21]).equals(EXMAP.get(numbers[21]))){
                            System.out.println("正解:"+MAP.get(emo[21]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:誰もが不通に経験する神経質、心配、困惑の感情");
                                break;
                                case 2 : System.out.println("ヒント:幅広い精神障害などでもみられます");
                                break;
                                case 3 : System.out.println("ヒント:○○障害");
                                break;
                                case 4 : System.out.println("ヒント:○○症");
                                break;
                                case 5 : System.out.println("ヒント:○○神経症");
                                break;
                                case 6 : System.out.println("gameover"+emotions[21]+":Anxiety \"+\"(=Anticipation \"+\"+Fear)"/*ヒント:○○感);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("○○感")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
                case 22 :{
                    System.out.println("喜びと信頼を合わせたものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        /*String Emotion=scanaria(l);
                        x=emotions[22];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                            x.substring(1,x.length()-1);
                            str=x;
                       }else{
                           str=x;
                       }
                       if(Emotion.equals(str)){
                           System.out.println("正解"+emotions[0]);
                       }*/
 /*if(Emotion.equals(x)){
                            System.out.println("正解:"+emotions[22]);
                            break;
                        }*/
 /*if(scanaria(l) == null ? number[22] == null : scanaria(l).equals(number[22])){
                            System.out.println("正解:"+emotions[22]);
                            break;
                        }
                        if(MAP.get(emo[22]).equals(EXMAP.get(numbers[22]))){
                            System.out.println("正解:"+MAP.get(emo[22]));
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:悪い魔法使いが得られなかったもの");
                                break;
                                case 2 : System.out.println("ヒント:「そのものの価値を認め、強く引き付けられる気持ち」");
                                break;
                                case 3 : System.out.println("ヒント:大事なものとして慕う心");
                                break;
                                case 4 : System.out.println("ヒント:かわいがる");
                                break;
                                case 5 : System.out.println("ヒント:男女が思いあう");
                                break;
                                case 6 : System.out.println("gameover"+emotions[22]+"Love \"+\"(=Joy \"+\"+Trust)"/*ヒント:ドイツ語でLiebeを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でLiebeを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
            case 23 :{
                System.out.println("期待と信頼を合わせたものを何という？");
                System.out.println("回答を入力して下さい");
                for(int i=0;i<7;i++){
                    /*String Emotion=scanaria(l);
                    x=emotions[23];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                        x.substring(1,x.length()-1);
                        str=x;
                   }else{
                       str=x;
                   }
                   if(Emotion.equals(str)){
                       System.out.println("正解"+emotions[0]);
                   }*/
 /*if(Emotion.equals(x)){
                        System.out.println("正解:"+emotions[23]);
                        break;
                    }*/
 /*if(scanaria(l) == null ? number[23] == null : scanaria(l).equals(number[23])){
                        System.out.println("正解:"+emotions[23]);
                        break;
                    }
                    if(MAP.get(emo[23]).equals(EXMAP.get(numbers[23]))){
                        System.out.println("正解:"+MAP.get(emo[23]));
                        break;
                    }else{
                        switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:○○の魔法使い");
                                break;
                                case 2 : System.out.println("ヒント:未来に望みをかけること");
                                break;
                                case 3 : System.out.println("ヒント:「こうなればよい、なってほしいと願う事」");
                                break;
                                case 4 : System.out.println("ヒント:その事柄の内容");
                                break;
                                case 5 : System.out.println("ヒント:望み通りになるだろうという良い見通し");
                                break;
                                case 6 : System.out.println("gameover"+emotions[23]+":Hope \"+\"(=Anticipation \"+\"+Trust)"/*ヒント:ドイツ語でHoffnungを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でHoffnungを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
            case 24 :{
                System.out.println("怒りと信頼を合わせたものを何という？");
                System.out.println("回答を入力して下さい");
                for(int i=0;i<7;i++){
                    /*String Emotion=scanaria(l);
                    x=emotions[24];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                        x.substring(1,x.length()-1);
                        str=x;
                   }else{
                       str=x;
                   }
                   if(Emotion.equals(str)){
                       System.out.println("正解"+emotions[0]);
                   }*/
 /*if(Emotion.equals(x)){
                        System.out.println("正解:"+emotions[24]);
                        break;
                    }*/
 /*if(scanaria(l) == null ? number[24] == null : scanaria(l).equals(number[24])){
                        System.out.println("正解:"+emotions[24]);
                        break;
                    }
                    if(MAP.get(emo[24]).equals(EXMAP.get(numbers[24]))){
                        System.out.println("正解:"+MAP.get(emo[24]));
                        break;
                    }else{
                        switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、応用感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:他より立ちまさった(有利な)位置や立場");
                                break;
                                case 2 : System.out.println("ヒント:○○に立つ");
                                break;
                                case 3 : System.out.println("ヒント:味方に○○な戦局");
                                break;
                                case 4 : System.out.println("ヒント:○○性");
                                break;
                                case 5 : System.out.println("ヒント:幸福○○");
                                break;
                                case 6 : System.out.println("gameover"+emotions[24]+":Dominance \"+\"(=Anger \"+\"+Trust)"/*ヒント:ドイツ語でÜberlegenheitを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("ドイツ語でÜberlegenheitを意味する")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
            default :{
                System.out.println("問題");
                System.out.println("回答を入力して下さい");
                for(int i=0;i<7;i++){
                    /*String Emotion=scanaria(l);
                    x=emotions[0];*/
 /*if(x.charAt(0)==co&&x.charAt(x.length()-1)==co){
                        x.substring(1,x.length()-1);
                        str=x;
                   }else{
                       str=x;
                   }
                   if(Emotion.equals(str)){
                       System.out.println("正解"+emotions[0]);
                   }*/
 /*if(Emotion.equals(x)){
                        System.out.println("正解:"+emotions[0]);
                        break;
                    }*/
 /*if(scanaria(l) == null ? number[0] == null : scanaria(l).equals(number[0])){
                        System.out.println("正解:"+emotions[0]);
                        break;
                    }
                    if(MAP.get(emo[0]).equals(EXMAP.get(numbers[0]))){
                        System.out.println("正解:"+MAP.get(emo[0]));
                        break;
                    }else{
                        switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 : System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Emotion="0";
                        if(m.equals("")){
                            System.out.println("正解:"+add(Emotion));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }
public static void pullaria(String pull) {
        System.out.println("減算エリア");
        String emotions[][]=new String[10][10];
        feeling(emotions);
        int d=0;
        //char co='"';
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);
        String x;
        String l="0";
scanaria(l);
        String hint[]=new String[100];
        lasthint(hint);
        while(d<2){
            d++;
            int z=new java.util.Random().nextInt(25);
            switch (z) {
                case 0 :{
                    System.out.println("喜怒哀楽から哀しいと哀しいと怒りを外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int j=0;j<7;j++){
                        String decrease=scanaria(l);
                        x=emotions[2][5];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[2][5]);
                            break;
                        }
                        /*if(numbers[25]==numbering[25]){
                            System.out.println("正解:"+emotions[25]);
                            break;
                        } else{
                            switch (j) {
                                case 0 : System.out.println("ヒント:気持ちよく明るい気分だ");
                                break;
                                case 1 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情、弱い感情、強い感情、応用感情のどれにも位置しない」");
                                break;
                                case 2 : System.out.println("ヒント:戦騎");
                                break;
                                case 3 : System.out.println("ヒント:のびのびと満ち足りた気持ちだ");
                                break;
                                case 4 : System.out.println("ヒント:愉しい");
                                break;
                                case 5 : System.out.println("ヒント:○○○ピクニック");
                                break;
                                case 6 : System.out.println("gameover"+emotions[2][5]+":Enjoy \"+\"(=joy, anger, sadness, Enjoy \"+\"-joy \"+\"-anger \"+\"-sadness)"/*ヒント:ドイツ語でSpaβを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でSpaβを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("嬉笑怒罵から嬉しいと笑うと罵るを外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[26];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[26]);
                            break;
                        }
                        /*if(numbers[26]==numbering[26]){
                            System.out.println("正解:"+emotions[26]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:はらだち");
                                break;
                                case 2 : System.out.println("ヒント:戦騎");
                                break;
                                case 3 : System.out.println("ヒント:いきどおり");
                                break;
                                case 4 : System.out.println("ヒント:原初的な感情の一つ");
                                break;
                                case 5 : System.out.println("ヒント:○○の状態");
                                break;
                                case 6 : System.out.println("gameover"+emotions[26]+":Anger \"+\"(=Happy laughing angry cursing \"+\"-happy \"+\"-laugh \"+\"-curse)"/*ヒント:おこっていること);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("おこっていること")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 2 :{
                    System.out.println("哀哀父母から哀しい一つと父と母を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[27];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[27]);
                            break;
                        }
                        /*if(numbers[27]==numbering[27]){
                            System.out.println("正解:"+emotions[27]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:感情に所属しており、強い感情に位置している");
                                break;
                                case 1 : System.out.println("ヒント:負の感情の1つ胸が締め付けられるといった身体的感覚");
                                break;
                                case 2 : System.out.println("ヒント:戦騎");
                                break;
                                case 3 : System.out.println("ヒント:胸が締め付けられるといった身体的感覚");
                                break;
                                case 4 : System.out.println("ヒント:○○○に暮れる");
                                break;
                                case 5 : System.out.println("ヒント:哀しい気持ちや心");
                                break;
                                case 6 : System.out.println("gameover"+emotions[27]+":Sad \"+\"(=grieving parents \"+\"-A sad one \"+\"-father \"+\"-mother)"/*ヒント:悲嘆);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("悲嘆")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("愛別離苦から別れる離れると愛するを外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[28];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[28]);
                            break;
                        }
                        /*if(numbers[28]==numbering[28]){
                            System.out.println("正解:"+emotions[28]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:（見聞きして）心が痛み極めて悲しい事");
                                break;
                                case 2 : System.out.println("ヒント:あまりに悲しくて心が痛むこと");
                                break;
                                case 3 : System.out.println("ヒント:○○な面持ち");
                                break;
                                case 4 : System.out.println("ヒント:○○な叫び");
                                break;
                                case 5 : System.out.println("ヒント:悲しさを痛ましく思う事");
                                break;
                                case 6 : System.out.println("gameover"+emotions[28]+":Grief \"+\"(=separation pain \"+\"-Love \"+\"-break up \"+\"-Leave)"/*ヒント:ドイツ語でHerzschmerzを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でHerzschmerzを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("狂喜乱舞から狂うと乱れると舞うを外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[29];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[29]);
                            break;
                        }
                        /*if(numbers[29]==numbering[29]){
                            System.out.println("正解:"+emotions[29]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:うれしく思う心・気持ち");
                                break;
                                case 2 : System.out.println("ヒント:満足な思い");
                                break;
                                case 3 : System.out.println("ヒント:戦騎");
                                break;
                                case 4 : System.out.println("ヒント:悦び");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でFreudeを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[29]+":Joy \"+\"(=Crazy dance \"+\"-go crazy \"+\"-be disturbed \"+\"-dance)"/*ヒント:慶び);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("慶び")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("恐恐謹言から恐れ一つと謹言を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[30];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[30]);
                            break;
                        } 
                        /*if(numbers[30]==numbering[30]){
                            System.out.println("正解:"+emotions[30]);
                            break;
                    } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:おそれること");
                                break;
                                case 2 : System.out.println("ヒント:悪いことが起こるのではないかという心配");
                                break;
                                case 3 : System.out.println("ヒント:懸念");
                                break;
                                case 4 : System.out.println("ヒント:畏れ");
                                break;
                                case 5 : System.out.println("ヒント:恐怖");
                                break;
                                case 6 : System.out.println("gameover"+emotions[30]+":Fear \"+\"(=I apologize for the inconvenience \"+\"-one fear \"+\"-Greetings)"/*ヒント:ドイツ語でFurchtを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でFurchtを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 6 :{
                    System.out.println("驚心動魄から心と動くと魄を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[31];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[31]);
                            break;
                        }
                        /*if(numbers[31]==numbering[31]){
                            System.out.println("正解:"+emotions[31]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:動物が予期しない事象を体験した時に起こる瞬間的な感情をいう");
                                break;
                                case 2 : System.out.println("ヒント:驚愕");
                                break;
                                case 3 : System.out.println("ヒント:他の感情に比べて単純かつ原始的");
                                break;
                                case 4 : System.out.println("ヒント:生理的反応と強く結びついた情動");
                                break;
                                case 5 : System.out.println("ヒント:愕き");
                                break;
                                case 6 : System.out.println("gameover"+emotions[31]+":Surprise \"+\"(=Shocking heart \"+\"-heart \"+\"-move \"+\"-spirit)"/*ヒント:年齢的な差異は殆ど無い);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("年齢的な差異は殆ど無い")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 7 :{
                    System.out.println("自己嫌悪から自己を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[32];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[32]);
                            break;
                        }
                        /*if(numbers[32]==numbering[32]){
                            System.out.println("正解:"+emotions[32]);
                            break;
                        }else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:憎み嫌う事");
                                break;
                                case 2 : System.out.println("ヒント:不愉快に思う事");
                                break;
                                case 3 : System.out.println("ヒント:不正を○○する");
                                break;
                                case 4 : System.out.println("ヒント:○○感");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でder Ekelを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[32]+":Disgust \"+\"(=self hate \"+\"-self)"/*:ヒント:同族○○);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("同族○○")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 8 :{
                    System.out.println("期待値から値を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[33];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[33]);
                            break;
                        }
                        /*if(numbers[33]==numbering[33]){
                            System.out.println("正解:"+emotions[33]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:ある人がそれをするのを（他の人が）あてにし、心待ちに待つこと");
                                break;
                                case 2 : System.out.println("ヒント:将来それが実現するように待ち構えること");
                                break;
                                case 3 : System.out.println("ヒント:あることが実現するだろうと望みをかけて待ち受けること");
                                break;
                                case 4 : System.out.println("ヒント:「何らかのことが実現するだろう、と望みつつ待つこと」");
                                break;
                                case 5 : System.out.println("ヒント:好ましい状態の実現を心の中で待ち望んでいる様子");
                                break;
                                case 6 : System.out.println("gameover"+emotions[33]+":Anticipation \"+\"(=Expected value \"+\"-value)"/*ヒント:ドイツ語でErwartungenを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でErwartungenを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 9 :{
                    System.out.println("信頼度成長曲線から度と成長曲線を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[34];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[34]);
                            break;
                        }
                        /*if(numbers[34]==numbering[34]){
                            System.out.println("正解:"+emotions[34]);
                            break;
                        }  else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、基本感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:頼りに出来るとして信ずること");
                                break;
                                case 2 : System.out.println("ヒント:信じて頼りとすること");
                                break;
                                case 3 : System.out.println("ヒント:信用して任せること");
                                break;
                                case 4 : System.out.println("ヒント:信じて頼りにする気持ち");
                                break;
                                case 5 : System.out.println("ヒント:○○性");
                                break;
                                case 6 : System.out.println("gameover"+emotions[34]+":Trust \"+\"(=Confidence growth curve \"+\"-degree \"+\"-growth curve)"/*ヒント:○○度);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("○○度")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 10 :{
                    System.out.println("恍惚の人からのと人を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[35];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[35]);
                            break;
                        }
                        /*if(numbers[35]==numbering[35]){
                            System.out.println("正解:"+emotions[35]);
                            break;
                        }  else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「物事に心をうばわれて、うっとりする様」");
                                case 2 : System.out.println("ヒント:ぼけていること");
                                break;
                                case 3 : System.out.println("ヒント:○○として聴き入る");
                                break;
                                case 4 : System.out.println("ヒント:○○の境地");
                                break;
                                case 5 : System.out.println("ヒント:意識がはっきりしないさま");
                                break;
                                case 6 : System.out.println("gameover"+emotions[35]+":Ecstasy \"+\"(=ecstatic person \"+\"-of \"+\"-person)"/*ヒント:ドイツ語でEkstaseを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でEkstaseを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 11 :{
                    System.out.println("警戒区域から区域を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[36];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[36]);
                            break;
                        }
                        /*if(numbers[36]==numbering[36]){
                            System.out.println("正解:"+emotions[36]);
                            break;
                        }  else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「好ましくないことが起こらないように、注意し用心する事」");
                                break;
                                case 2 : System.out.println("ヒント:徹夜で○○にあたる");
                                break;
                                case 3 : System.out.println("ヒント:○○レベル");
                                break;
                                case 4 : System.out.println("ヒント:インフレを○○する");
                                break;
                                case 5 : System.out.println("ヒント:「危険や災害に備えて、あらかじめ注意し、用心すること」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[36]+":Vigilance \"+\"(=restricted area \"+\"-area)"/*ヒント:ドイツ語でWachsamkeitを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でWachsamkeitを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 12 :{
                    System.out.println("激怒症候群から症候群を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[37];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[37]);
                            break;
                        }
                        /*if(numbers[37]==numbering[37]){
                            System.out.println("正解:"+emotions[37]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:激しく怒る事");
                                break;
                                case 2 : System.out.println("ヒント:酷い立腹");
                                break;
                                case 3 : System.out.println("ヒント:大○○");
                                break;
                                case 4 : System.out.println("ヒント:○○する");
                                break;
                                case 5 : System.out.println("ヒント:先生の○○を買う");
                                break;
                                case 6 : System.out.println("gameover"+emotions[37]+":Rage \"+\"(=rage syndrome \"+\"-syndrome)"/*ヒント:怒りの段階の1つである);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("怒りの段階の1つである")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 13 :{
                    System.out.println("憎悪の念からのと念を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[38];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[38]);
                            break;
                        }
                        /*if(numbers[38]==numbering[38]){
                            System.out.println("正解:"+emotions[38]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情及び負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:憎み嫌う事");
                                break;
                                case 2 : System.out.println("ヒント:酷く憎むこと");
                                break;
                                case 3 : System.out.println("ヒント:戦争を○○する");
                                break;
                                case 4 : System.out.println("ヒント:○○の科学");
                                break;
                                case 5 : System.out.println("ヒント:○○のピラミッド");
                                break;
                                case 6 : System.out.println("gameover"+emotions[38]+":Loathing \"+\"(=thoughts of hatred \"+\"-of \"+\"-Thought)"/*ヒント:ドイツ語でHassを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でHassを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 14 :{
                    System.out.println("驚嘆に値するからにと値するを外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[39];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[39]);
                            break;
                        }
                        /*if(numbers[39]==numbering[39]){
                            System.out.println("正解:"+emotions[39]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:非常に驚くこと");
                                break;
                                case 2 : System.out.println("ヒント:大きな驚き");
                                break;
                                case 3 : System.out.println("ヒント:びっくりして感心する事");
                                break;
                                case 4 : System.out.println("ヒント:酷く感心すること");
                                break;
                                case 5 : System.out.println("ヒント:思いがけない出来事に会って驚くこと");
                                break;
                                case 6 : System.out.println("gameover"+emotions[39]+":Amazement \"+\"(=amazing \"+\"-to \"+\"-worthy)"/*ヒント:ドイツ語でStaunenを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でStaunenを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 15 :{
                    System.out.println("恐怖しろ！からしろと！を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[40];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[40]);
                            break;
                        }
                        /*if(numbers[40]==numbering[40]){
                            System.out.println("正解:"+emotions[40]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情及び負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:恐れること");
                                break;
                                case 2 : System.out.println("ヒント:恐れる心");
                                break;
                                case 3 : System.out.println("ヒント:恐ろしい感じ");
                                break;
                                case 4 : System.out.println("ヒント:○○にかられる");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でFurchtを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[40]+":Terror \"+\"(=Be afraid! \"+\"-do \"+\"-!)"/*ヒント:○○心);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("○○心")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 16 :{
                    System.out.println("感嘆符から符を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[41];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[41]);
                            break;
                        }
                        /*if(numbers[41]==numbering[41]){
                            System.out.println("正解:"+emotions[41]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、強い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「感心して、ほめること」");
                                break;
                                case 2 : System.out.println("ヒント:なげきかなしむこと");
                                break;
                                case 3 : System.out.println("ヒント:熱意と努力に○○する");
                                break;
                                case 4 : System.out.println("ヒント:○○Ⅱ");
                                break;
                                case 5 : System.out.println("ヒント:○○の声を上げる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[41]+":Admiration \"+\"(=Exclamation point \"+\"-sign)"/*ヒント:ドイツ語でBewunderungを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でBewunderungを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 17 :{
                    System.out.println("平穏無事から無事を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                    String decrease=scanaria(l);
                    x=emotions[42];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[42]);
                            break;
                        }
                        /*if(numbers[42]==numbering[42]){
                            System.out.println("正解:"+emotions[42]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「変ったことも怒らず、おだやかなさま」");
                                break;
                                case 2 : System.out.println("ヒント:○○な日常を送る");
                                break;
                                case 3 : System.out.println("ヒント:心の○○");
                                break;
                                case 4 : System.out.println("ヒント:静かに穏やかな事");
                                break;
                                case 5 : System.out.println("ヒント:○○死");
                                break;
                                case 6 : System.out.println("gameover"+emotions[42]+":Serenity \"+\"(=Peaceful and safe \"+\"-safely)"/*ヒント:ドイツ語でFriedenを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でFriedenを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 18 :{
                    System.out.println("興味津津から津津を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[43];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[43]);
                            break;
                        }
                        /*if(numbers[43]==numbering[43]){
                            System.out.println("正解:"+emotions[43]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:人の関心をそそる面白み");
                                break;
                                case 2 : System.out.println("ヒント:ある対象に対する特別の関心");
                                break;
                                case 3 : System.out.println("ヒント:○○に満ちた表情");
                                break;
                                case 4 : System.out.println("ヒント:○○を引く");
                                break;
                                case 5 : System.out.println("ヒント:○○がわく");
                                break;
                                case 6 : System.out.println("gameover"+emotions[43]+":Interest \"+\"(=Interesting \"+\"-all over)"/*ヒント:ドイツ語でInteresseを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でInteresseを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 19 :{
                    System.out.println("煩雑世界から雑と世界を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[44];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[44]);
                            break;
                        }
                        /*if(numbers[44]==numbering[44]){
                            System.out.println("正解:"+emotions[44]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:わずらわしいこと");
                                break;
                                case 2 : System.out.println("ヒント:うるさいこと");
                                break;
                                case 3 : System.out.println("ヒント:うるさいさま");
                                break;
                                case 4 : System.out.println("ヒント:煩瑣");
                                break;
                                case 5 : System.out.println("ヒント:騒音のうるささ");
                                break;
                                case 6 : System.out.println("gameover"+emotions[44]+":Annoyance \"+\"(=complicated world \"+\"-rough \"+\"-world)"/*ヒント:むしゃくしゃ);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("むしゃくしゃ")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 20 :{
                    System.out.println("憂鬱な未来から鬱なと未来を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[45];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[45]);
                            break;
                        }
                        /*if(numbers[45]==numbering[45]){
                            System.out.println("正解:"+emotions[45]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:思うようにならなくてつらい");
                                break;
                                case 2 : System.out.println("ヒント:せつない");
                                break;
                                case 3 : System.out.println("ヒント:憂鬱だ");
                                break;
                                case 4 : System.out.println("ヒント:愁い");
                                break;
                                case 5 : System.out.println("ヒント:悲しみ");
                                break;
                                case 6 : System.out.println("gameover"+emotions[45]+":Pensiveness \"+\"(=gloomy future \"+\"-Depressed \"+\"-future)"/*ヒント:ドイツ語でTraurigkeitを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でTraurigkeitを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 21 :{
                    System.out.println("退屈心理から心理を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[46];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[46]);
                            break;
                        }
                        /*if(numbers[46]==numbering[46]){
                            System.out.println("正解:"+emotions[46]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「相変わらずの状態が続くので心が晴れず、あきること」");
                                break;
                                case 2 : System.out.println("ヒント:くたびれて気力が衰えること");
                                break;
                                case 3 : System.out.println("ヒント:いやになること");
                                break;
                                case 4 : System.out.println("ヒント:いやになるさま");
                                break;
                                case 5 : System.out.println("ヒント:「することがなくて、時間を持て余すこと」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[46]+":Boredom \"+\"(=boredom psychology \"+\"-psychoygy)"/*ヒント:つまらないこと);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("つまらないこと")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 22 :{
                    System.out.println("動揺性歩行から性と歩行を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[47];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[47]);
                            break;
                        }
                        /*if(numbers[47]==numbering[47]){
                            System.out.println("正解:"+emotions[47]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「他からの作用で、動き揺れること」");
                                break;
                                case 2 : System.out.println("ヒント:「転じて、気持ちなどが不安定になること」");
                                break;
                                case 3 : System.out.println("ヒント:不安");
                                break;
                                case 4 : System.out.println("ヒント:さわぎ");
                                break;
                                case 5 : System.out.println("ヒント:心の○○を隠す");
                                break;
                                case 6 : System.out.println("gameover"+emotions[47]+":Distraction \"+\"(=agitated gait \"+\"-gender \"+\"-walking)"/*ヒント:ドイツ語でverärgernを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でverärgernを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 23 :{
                    System.out.println("心配事から事を外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[48];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[48]);
                            break;
                        }
                        /*if(numbers[48]==numbering[48]){
                            System.out.println("正解:"+emotions[48]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:おもいわずらうこと");
                                break;
                                case 2 : System.out.println("ヒント:きがかり");
                                break;
                                case 3 : System.out.println("ヒント:上手く運ぶように気を使って手配すること");
                                break;
                                case 4 : System.out.println("ヒント:配慮");
                                break;
                                case 5 : System.out.println("ヒント:きにかけてめんどうをみること");
                                break;
                                case 6 : System.out.println("gameover"+emotions[48]+":Apprehension \"+\"(=Anxiety \"+\"-case)"/*ヒント:ドイツ語でAngstを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でAngstを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                case 24 :{
                    System.out.println("容認発音から発音外したものを何という？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[49];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[49]);
                            break;
                        }
                        /*if(numbers[49]==numbering[49]){
                            System.out.println("正解:"+emotions[49]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、弱い感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「それでよいとして、認めること」");
                                break;
                                case 2 : System.out.println("ヒント:行動の自由を○○する");
                                break;
                                case 3 : System.out.println("ヒント:許せる範囲と認めて許すこと");
                                break;
                                case 4 : System.out.println("ヒント:複国籍○○");
                                break;
                                case 5 : System.out.println("ヒント:副業○○");
                                break;
                                case 6 : System.out.println("gameover"+emotions[49]+":Acceptance \"+\"(acceptable pronunciation \"+\"-pronunciation)"/*ヒント:ドイツ語でAnnahmeを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("ドイツ語でAnnahmeを意味する")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
                default :{
                    System.out.println("問題");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String decrease=scanaria(l);
                        x=emotions[0];
                        if(decrease.equals(x)){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }
                        /*if(numbers[0]==numbering[0]){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 : System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String decrease="0";
                        if(m.equals("")){
                            System.out.println("正解:"+pull(decrease));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }
    public static void Squaredaria(String Squared) {
        System.out.println("乗算エリア");
        String emotions[][]=new String[10][10];
        feeling(emotions);
        int e=0;
        //char co='"';
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);
        String x;
        String l="0";
scanaria(l);
        /*String hint[]=new String[100];
        lasthint(hint);
        while(e<2){
            e++;
            int a=new java.util.Random().nextInt(6);
            switch (a) {
                case 0 :{
                    System.out.println("笑われるとコンプレックスから生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Deadlysins=scanaria(l);
                        x=emotions[5][0];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[5][0]);
                            break;
                        }
                        /*if(numbers[50]==numbering[50]){
                            System.out.println("正解:"+emotions[50]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「取得する経験値、熟練度、各能力値が大幅に上昇する代わりに好戦的になり許容量以上の経験値をため込んでしまう」");
                                break;
                                case 2 : System.out.println("ヒント:高ぶって人を侮り見下す態度であること");
                                break;
                                case 3 : System.out.println("ヒント:○○無礼");
                                break;
                                case 4 : System.out.println("ヒント:調子づいて人を馬鹿にする");
                                break;
                                case 5 : System.out.println("ヒント:ひとをみくびって礼儀を欠くこと");
                                break;
                                case 6 : System.out.println("gameover"+emotions[5][0]+":Deadlysins =\"Arrogance \"+\"(=be laughed at* \"+\"Complex)"/*ヒント:ドイツ語でArroganzを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("ドイツ語でArroganzを意味する")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("理性消失と本能的殺戮から生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Deadlysins=scanaria(l);
                        x=emotions[51];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[51]);
                            break;
                        }
                        /*if(numbers[51]==numbering[51]){
                            System.out.println("正解:"+emotions[51]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪及び負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「最大で通常の10倍近くまで代償なくステータスを底上げすることが出来るが、やがて唯の狂戦士と化す」");
                                break;
                                case 2 : System.out.println("ヒント:「つかみかからんばかりの恐ろしい形相で、激しく怒る事」");
                                break;
                                case 3 : System.out.println("ヒント:○○の悪魔");
                                break;
                                case 4 : System.out.println("ヒント:非道な行為に○○する");
                                break;
                                case 5 : System.out.println("ヒント:○○の魔女");
                                break;
                                case 6 : System.out.println("gameover"+emotions[51]+":Deadlysins =\"Wrath \"+\"(=Reason disappears* \"+\"Instinctive massacre)"/*ヒント:ドイツ語でWutを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("ドイツ語でWutを意味する")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                }
                break;
                case 2 :{
                    System.out.println("周囲大幅消費と自己効率から生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Deadlysins=scanaria(l);
                        x=emotions[52];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+"gameover"+emotions[52]);
                            break;
                        }
                        /*if(numbers[52]==numbering[52]){
                            System.out.println("正解:"+emotions[52]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「精神に異常をきたすことは無く、皮肉が込められている」");
                                break;
                                case 2 : System.out.println("ヒント:「つかみかからんばかりの恐ろしい形相で、激しく怒る事」");
                                break;
                                case 3 : System.out.println("ヒント:なまけておりだらしないさま");
                                break;
                                case 4 : System.out.println("ヒント:○○の悪魔");
                                break;
                                case 5 : System.out.println("ヒント:魔女教大罪司教○○担当");
                                break;
                                case 6 : System.out.println("gameover"+emotions[52]+":Deadlysins =\"Lazy \"+\"(=The neighborhood large consumption* \"+\"Self efficiency)"/*ヒント:○○の魔女);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("○○の魔女")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("殺害相手からランダムに一部略奪と満たされない欲望から生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Deadlysins=scanaria(l);
                        x=emotions[53];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[53]);
                            break;
                        }
                        /*if(numbers[53]==numbering[53]){
                            System.out.println("正解:"+emotions[53]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「eを加えた場合、錬金術で生み出されたメダルを体内に収納しているといずれはグリードへと堕ちていく」");
                                break;
                                case 2 : System.out.println("ヒント:あくどいほど欲が張っている事");
                                break;
                                case 3 : System.out.println("ヒント:「際限なく、何が何でも、自分の欲を満たそうとするさま」");
                                break;
                                case 4 : System.out.println("ヒント:○○の悪魔");
                                break;
                                case 5 : System.out.println("ヒント:○○の魔女");
                                break;
                                case 6 : System.out.println("gameover"+emotions[53]+":Greed \"+\"(=I plunder the killing partner of it partly at random* \"+\"The greed that is not satisfied)"/*ヒント:魔女教大罪司教○○担当);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("魔女教大罪司教○○担当")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("あらゆるものを対象に食すことが可能と永久空腹から生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Deadlysins=scanaria(l);
                        x=emotions[54];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[54]);
                            break;
                        }
                        /*if(numbers[54]==numbering[54]){
                            System.out.println("正解:"+emotions[54]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「永久空腹は克服可能であり、食したものはエネルギーとしてストックすることが出来る」");
                                break;
                                case 2 : System.out.println("ヒント:暴飲○○");
                                break;
                                case 3 : System.out.println("ヒント:○○する");
                                break;
                                case 4 : System.out.println("ヒント:○○の魔女");
                                break;
                                case 5 : System.out.println("ヒント:○○者");
                                break;
                                case 6 : System.out.println("gameover"+emotions[54]+":Gluttony \"+\"(=I can eat it targeting at every thing* \"+\"Eternity hunger)"/*ヒント:○○の悪魔);
                                break;
                            }
                        }
                    }
                   /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("○○の悪魔")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("相手に「催眠」「魅了」「洗脳」の状態異常を付与と激しい嫌悪感から生み出されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                       String Deadlysins=scanaria(l);
                        x=emotions[55];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[55]);
                            break;
                        }
                        /*if(numbers[55]==numbering[55]){
                            System.out.println("正解:"+emotions[55]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、七大罪に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「対象となった者は持ち主の意のままに操られるが、継続的に重ね掛けが必要となる」");
                                break;
                                case 2 : System.out.println("ヒント:性的な欲望");
                                break;
                                case 3 : System.out.println("ヒント:情欲");
                                break;
                                case 4 : System.out.println("ヒント:○○の悪魔");
                                break;
                                case 5 : System.out.println("ヒント:色情と利欲");
                                break;
                                case 6 : System.out.println("gameover"+emotions[55]+":Lust \"+\"(=I give state abnormality of the \\\"hypnosis\\\" \\\"charm\\\" \\\"brainwashing\\\" to a partner* \"+\"Intense loathsomeness)"/*ヒント:ドイツ語でLustを意味する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("ドイツ語でLustを意味する")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
                default :{
                    System.out.println("問題");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                       String Deadlysins=scanaria(l);
                        x=emotions[0];
                        if(Deadlysins.equals(x)){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }
                        /*if(numbers[0]==numbering[0]){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 :System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Deadlysins="0";
                        if(m.equals("")){
                            System.out.println("正解:"+Squared(Deadlysins));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }
    public static void Multiplicationdivisionaria(String Multiplicationdivision) {
        System.out.println("乗算除算エリア");
        String emotions[][]=new String[10][10];
        feeling(emotions);
        int f=0;
        //char co='"';
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);
        String x;
        String l="0";
scanaria(l);
        /*String hint[]=new String[100];
        lasthint(hint);
        while(f<2){
            int b=new java.util.Random().nextInt(8);
            f++;
            switch (b) {
                case 0 :{
                    System.out.println("死者蘇生と禁忌から生み出され、自己を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[5][6];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[5][6]);
                            break;
                        }
                        /*if(numbers[56]==numbering[56]){
                            System.out.println("正解:"+emotions[56]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「死亡から数分程度でなければ使用できず、使用するごとに禁忌レベルが上昇してきます」");
                                break;
                                case 2 : System.out.println("ヒント:「仏・菩薩が人々をあわれみ、楽しみを与え、苦しみを取り除くこと」");
                                break;
                                case 3 : System.out.println("ヒント:「いつくしみ、あわれむこと」");
                                break;
                                case 4 : System.out.println("ヒント:○○の天使王");
                                break;
                                case 5 : System.out.println("ヒント:○○深い");
                                break;
                                case 6 : System.out.println("gameover"+emotions[5][6]+":Mercy \"+\"(=resurrection of the dead* \"+\"Taboo\"+\"/self)"/*ヒント:「他者の苦しみを理解し、その苦しみを和らげることを心から願う感情や態度を指します);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("「他者の苦しみを理解し、その苦しみを和らげることを心から願う感情や態度を指します」")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("死亡回避と防御・抵抗の能力上昇と耐性系熟練度補正から生み出され、我慢を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[57];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[57]);
                            break;
                        }
                        /*if(numbers[57]==numbering[57]){
                            System.out.println("正解:"+emotions[57]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「体力を1残し、生存する」");
                                break;
                                case 2 : System.out.println("ヒント:「苦しさ、辛さ、悲しさなどを耐え忍ぶこと」");
                                break;
                                case 3 : System.out.println("ヒント:○○力");
                                break;
                                case 4 : System.out.println("ヒント:○○の天使");
                                break;
                                case 5 : System.out.println("ヒント:○○強い");
                                break;
                                case 6 : System.out.println("gameover"+emotions[57]+":Patience \"+\"(=death avoidance* \" +\"Defense/resistance ability increase and resistance proficiency correction* \"+\"Resistance proficiency correction \"+\"/Patience)"/*ヒント:じっと耐え忍ぶこと);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("じっと耐え忍ぶこと")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 2 :{
                    System.out.println("魂移す侵食乗っ取りと半分不死から生み出され、他者の意思を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[58];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[58]);
                            break;
                        }
                        /*if(numbers[58]==numbering[58]){
                            System.out.println("正解:"+emotions[58]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:一日も欠かすことなく毎日同じことを繰り返す");
                                break;
                                case 2 : System.out.println("ヒント:仕事や勉強に一所懸命に励むこと");
                                break;
                                case 3 : System.out.println("ヒント:○○家");
                                break;
                                case 4 : System.out.println("ヒント:良く働き、学ぶこと");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でSorgfaltを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[58]+":Diligence \"+\"(=Erosion takeover to move the soul* \"+\"half immortal \"+\"/the will of others)"/*ヒント:たゆまずに一所懸命にあることを続けていく様);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("たゆまずに一所懸命にあることを続けていく様")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("自身を中心に自己及び味方へ体力超速回復と寄付から生み出され、ストックを省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[59];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[59]);
                            break;
                        }
                        /*if(numbers[59]==numbering[59]){
                            System.out.println("正解:"+emotions[59]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:最下級回復術師");
                                break;
                                case 2 : System.out.println("ヒント:「貧乏人・被災者等を救い、恵むこと」");
                                break;
                                case 3 : System.out.println("ヒント:困っている人に見舞いの金品などを与えて救うこと");
                                break;
                                case 4 : System.out.println("ヒント:万人の○○");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でErleichtterungを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[59]+":Relief \"+\"(=Super fast recovery of physical strength to self and allies* \"+\"donation \"+\"/stock)"/*ヒント:○○の王);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("○○の王")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("前世の記憶保持状態での転生可能と実質不死から生み出され、不正を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[60];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[60]);
                            break;
                        }
                        /*if(numbers[60]==numbering[60]){
                            System.out.println("正解:"+emotions[60]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:切り詰めて行動している");
                                break;
                                case 2 : System.out.println("ヒント:「欲望におぼれて度を超すことが無いように、適度に慎むこと」");
                                break;
                                case 3 : System.out.println("ヒント:規律正しく統率のとれている事");
                                break;
                                case 4 : System.out.println("ヒント:○○生活");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でMäßigkeitを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[60]+":Temperance \"+\"(=Reincarnation with memory of previous life retained* \"+\"Practically immortal \"+\"/fraud)"/*ヒント:○○の天使);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("○○の天使")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("魂を消費して神と同等の力を得ると対等な立場から生み出され、不快感を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[61];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[61]);
                            break;
                        }
                        /*if(numbers[61]==numbering[61]){
                            System.out.println("正解:"+emotions[61]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:魂魄の一部を神へと渡すこと");
                                break;
                                case 2 : System.out.println("ヒント:へりくだること");
                                break;
                                case 3 : System.out.println("ヒント:謙遜");
                                break;
                                case 4 : System.out.println("ヒント:○○の美徳");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でDemutを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[61]+":Humility \"+\"(=Consume your soul to gain power equal to that of a god* \"+\"equal position \"+\"/Discomfort)"/*ヒント:○○語);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("○○語")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 6 :{
                    System.out.println("自身の持つ神性領域を拡張すると強力な結界を展開するから生み出され、性的な関係を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[62];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[62]);
                            break;
                        }
                        /*if(numbers[62]==numbering[62]){
                            System.out.println("正解:"+emotions[62]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、七美徳に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:ピュアである");
                                break;
                                case 2 : System.out.println("ヒント:肉体や心が汚れていない事");
                                break;
                                case 3 : System.out.println("ヒント:「心身にけがれがなく、清らかな事」");
                                break;
                                case 4 : System.out.println("ヒント:赤いフリージアの花言葉");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でReinheitを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[62]+":Purity \"+\"(=Expand your own divine realm* \"+\"develop a powerful barrier \"+\"/sexual relationship)"/*ヒント:スズランの花言葉);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("スズランの花言葉")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                case 7 :{
                    System.out.println("全情報閲覧とマッピングと追跡と魔道の極みと星魔から生み出され、拒否を省くものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[63];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[63]);
                            break;
                        }
                        /*if(numbers[63]==numbering[63]){
                            System.out.println("正解:"+emotions[63]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「知識に所属しており、感情、七美徳、七大罪のいずれにも位置しない」");
                                break;
                                case 1 : System.out.println("ヒント:支配者権限に気まぐれで追加されたものである");
                                break;
                                case 2 : System.out.println("ヒント:深遠な道理を知り得る優れた知恵");
                                break;
                                case 3 : System.out.println("ヒント:物事の真実在の理性的、悟性的認識");
                                break;
                                case 4 : System.out.println("ヒント:○○の王");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でWeisheitを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[63]+":Wisdom \"+\"(=View all information* \"+\"mapping* \"+\"tracking* \"+\"The height of magic* \"+\"Star demon \"+\"/rejection)"/*ヒント:人類の○○);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("人類の○○")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
                default :{
                    System.out.println("問題");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Virtues=scanaria(l);
                        x=emotions[0];
                        if(Virtues.equals(x)){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }
                        /*if(numbers[0]==numbering[0]){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 : System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Virtues="0";
                        if(m.equals("")){
                            System.out.println("正解:"+Multiplicationdivision(Virtues));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }
    public static void arithmeticoperationaria(String arithmeticoperation) {
        System.out.println("演算エリア");
        String emotions[][]=new String[10][10];
        feeling(emotions);
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);
        String x;
        //char co='"';
        String l="0";
scanaria(l);
        /*String hint[]=new String[100];
        lasthint(hint);
        for(int g=0;g<2;g++){
            int h=new java.util.Random().nextInt(6);
            switch (h) {
                case 0 : {
                    System.out.println("深い悲しみと憎悪から至り、一つを除いてあらゆる感情が鎮静されるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[6][4];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[6][4]);
                            break;
                        }
                        /*if(numbers[64]==numbering[64]){
                            System.out.println("正解:"+emotions[64]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「他の存在や物事に対して抱く悪い感情、または見方」");
                                break;
                                case 2 : System.out.println("ヒント:わるぎ");
                                break;
                                case 3 : System.out.println("ヒント:○○がある");
                                break;
                                case 4 : System.out.println("ヒント:無意識の○○");
                                break;
                                case 5 : System.out.println("ヒント:○○の連鎖は止められない");
                                break;
                                case 6 : System.out.println("gameover"+emotions[6][4]+":Malice \"+\"(=deep sorrow* \"+\"hatred \"+\"%It is every feeling except one)"/*ヒント:「他の存在を憎み、害を加えようとする気持ち」);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("「他の存在を憎み、害を加えようとする気持ち」")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("殺し合う儀式と秘めた戦求本能から至り、全く同じものでは話にならないものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[65];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[65]);
                            break;
                        }
                        /*if(numbers[65]==numbering[65]){
                            System.out.println("正解:"+emotions[65]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:たたかうこと");
                                break;
                                case 2 : System.out.println("ヒント:あらそい");
                                break;
                                case 3 : System.out.println("ヒント:○○本能");
                                break;
                                case 4 : System.out.println("ヒント:○○の女神");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でKampfを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[65]+":Struggle \"+\"(=The ceremony that it spoils* \"+\"Hidden fighting instinct \"+\"%It doesn't matter if it's exactly the same"/*ヒント:○○を求める);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("○○を求める")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                case 2 :{
                    System.out.println("愛も欲も自分の中と気付けない存在が謳うから至り、心の中を探すものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[66];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[66]);
                            break;
                        }
                        /*if(numbers[66]==numbering[66]){
                            System.out.println("正解:"+emotions[66]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:存在を殺そうとする意志");
                                break;
                                case 2 : System.out.println("ヒント:存在を死に至らしめる危険性の高い行為をすることの認識");
                                break;
                                case 3 : System.out.println("ヒント:どうしようもなく相手に対して苛立ちなどを覚えた際に芽生える感情");
                                break;
                                case 4 : System.out.println("ヒント:○○の波動");
                                break;
                                case 5 : System.out.println("ヒント:スノードロップの花言葉より「貴方の死を望みます」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[66]+":Intention to kill \"+\"(=As for the love and the desire among oneself* \"+\"Existence not to be able to notice declares it \"+\"→I can look for it in a heart)"/*ヒント:○○の衝動);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("○○の衝動")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("個体の減少と星から存在しなくなるから至り、バランスが破損するものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                       String Perfectconclusion=scanaria(l);
                        x=emotions[67];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[67]);
                            break;
                        }
                        /*if(numbers[67]==numbering[67]){
                            System.out.println("正解:"+emotions[67]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:絶え滅びること");
                                break;
                                case 2 : System.out.println("ヒント:絶やし滅ぼすこと");
                                break;
                                case 3 : System.out.println("ヒント:地球上から永遠にいなくなってしますこと");
                                break;
                                case 4 : System.out.println("ヒント:○○危惧種");
                                break;
                                case 5 : System.out.println("ヒント:レッドリスト");
                                break;
                                case 6 : System.out.println("gameover"+emotions[67]+":Extinction \"+\"Decrease in individuals* \"+\"cease to exist from the stars \"+\"→balance is damaged"/*ヒント:人類が○○する);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("人類が○○する")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("死亡するフラグと成長するスピード速遅から至り、創造の先にあるものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[68];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[68]);
                            break;
                        }
                        /*if(numbers[68]==numbering[68]){
                            System.out.println("正解:"+emotions[68]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:存在価値を失うまでに駄目になる事");
                                break;
                                case 2 : System.out.println("ヒント:存在が身を滅ぼすこと");
                                break;
                                case 3 : System.out.println("ヒント:○○フラグ");
                                break;
                                case 4 : System.out.println("ヒント:○○の本");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でRuineを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[68]+":Catastrophe \"+\"(=flag to die* \"+\"growing fast and slow \"+\"→beyond creation"/*ヒント:○○的思考);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("○○的思考")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("破局的な被害を受けると失い陥った運命から至り、回避したいと思うものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[69];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+emotions[69]);
                            break;
                        }
                        /*if(numbers[69]==numbering[69]){
                            System.out.println("正解:"+emotions[69]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「感情に所属しており、負の感情に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:滅びること");
                                break;
                                case 2 : System.out.println("ヒント:絶えてなくなる事");
                                break;
                                case 3 : System.out.println("ヒント:○○迅雷");
                                break;
                                case 4 : System.out.println("ヒント:○○迅雷.net");
                                break;
                                case 5 : System.out.println("ヒント:ドイツ語でZerstörungを意味する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[69]+":Destruction \"+\"(=suffer catastrophic damage* \"+\"The fate I lost \"+\"→want to avoid"/*ヒント:睡蓮の花言葉);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("睡蓮の花言葉")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
                default :{
                    System.out.println("問題");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Perfectconclusion=scanaria(l);
                        x=emotions[0];
                        if(Perfectconclusion.equals(x)){
                            System.out.println("正解:"+"gameover"+emotions[0]+":Love And Hate");
                            break;
                        } 
                        /*if(numbers[0]==numbering[0]){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 : System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int k=0;k<hint.length;k++){
                        String m=hint[k];
                        String Perfectconclusion="0";
                        if(m.equals("")){
                            System.out.println("正解:"+arithmeticoperation(Perfectconclusion));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }
    public static void conversionaria(String conversion) {
        System.out.println("変換エリア");
        String emotions[][]=new String[10][10];
        feeling(emotions);
        String x;
        String l="0";
        //char co='"';
scanaria(l);
        /*int[] numbers;
        numbers=scanNumbers();
        int[] numbering=new int[100];
        mission(numbering);*/
        /*String hint[]=new String[100];
        lasthint(hint);
        for(int j=0;j<2;j++){
            int k=new java.util.Random().nextInt(30);
            switch (k) {
                case 0 :{
                    System.out.println("「それは聖なる力、それは未知への冒険、そしてそれは勇気の証」を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[7][0];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[7][0]);
                            break;
                        }
                        /*if(numbers[70]==numbering[70]){
                            System.out.println("正解:"+emotions[70]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「力に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:魔力等のエネルギーを使用して不思議なことを起こさせる術");
                                break;
                                case 2 : System.out.println("ヒント:「蜘蛛ですが、なにか」の世界において魔術をシステム（魔力を「スキル」により変化させて現象として確立したもの）を通して簡略化したもの");
                                break;
                                case 3 : System.out.println("ヒント:○○陣");
                                break;
                                case 4 : System.out.println("ヒント:ホグワーツ○○魔術学校");
                                break;
                                case 5 : System.out.println("ヒント:治癒○○の間違った使い方");
                                break;
                                case 6 : System.out.println("gameover"+emotions[7][0]+":Magic \"+\"(=It's holy power, it's an adventure into the unknown, and it's a proof of courage.)"/*ヒント:○○科高校の劣等生);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○科高校の劣等生")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 1 :{
                    System.out.println("輝く精神を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[71];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[71]);
                            break;
                        }
                        /*if(numbers[71]==numbering[71]){
                            System.out.println("正解:"+emotions[71]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「精神力に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:魅力や才能の源とされる輝く精神力");
                                case 2 : System.out.println("ヒント:ジャメンタルの対となる");
                                break;
                                case 3 : System.out.println("ヒント:キラメイジャーに変身する者に求められる素質");
                                break;
                                case 4 : System.out.println("ヒント:魔進戦隊キラメイジャーに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:キラメイストーンと共鳴する強靭な輝くの精神");
                                break;
                                case 6 : System.out.println("gameover"+emotions[71]+":Chiramental \"+\"(=shining spirit)"/*ヒント:○○○○○○湧いてきた);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○○○○○湧いてきた")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 2 :{
                    System.out.println("自分だけの何かを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[72];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+"gameover"+emotions[72]+":Love And Hate");
                            break;
                        }
                        /*if(numbers[72]==numbering[72]){
                            System.out.println("正解:"+emotions[72]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「どでかい夢」とか「やった！」「掴んだ！」というような感じ");
                                break;
                                case 2 : System.out.println("ヒント:一ノ瀬宝太郎は錬金術に見出した");
                                break;
                                case 3 : System.out.println("ヒント:仮面ライダーガッチャード/一ノ瀬宝太郎の口癖");
                                break;
                                case 4 : System.out.println("ヒント:仮面ライダーガッチャードに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:上手く行かなかったときはノー○○○○○");
                                break;
                                case 6 : System.out.println("gameover"+emotions[72]+":Gotcha \"+\"(=something just for me)"/*ヒント:「○○○○○を追い求め、創作料理を作ったりしている」);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("「○○○○○を追い求め、創作料理を作ったりしている」")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 3 :{
                    System.out.println("忍者に対して抱く各々の心の在り方や精神の持ち方と言った精神力を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[73];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[73]);
                            break;
                        }
                        /*if(numbers[73]==numbering[73]){
                            System.out.println("正解:"+emotions[73]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「精神力に所属しており、概念に位置している」");
                                break;
                                case 1 :System.out.println("ヒント:「２ディメンションの術を使用したのち必殺技として○○○○○爆裂波を放つ」");
                                break;
                                case 2 : System.out.println("ヒント:忍者の力の源ともいうべきもの");
                                break;
                                case 3 : System.out.println("ヒント:手裏剣戦隊ニンニンジャーにて登場する用語の1つ");
                                break;
                                case 4 : System.out.println("ヒント:高めろ！○○○○○‼");
                                break;
                                case 5 : System.out.println("ヒント:○○○○○絵巻");
                                break;
                                case 6 : System.out.println("gameover"+emotions[73]+":Shinobi Tality \"+\"(=Mental strength, such as the way each person's heart and spirit is held toward ninjas)"/*ヒント:喪失すると忍びとしての資格を失うことと同義である);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("喪失すると忍びとしての資格を失うことと同義である")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 4 :{
                    System.out.println("「創る、形成する」を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[74];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[74]);
                            break;
                        }
                        /*if(numbers[74]==numbering[74]){
                            System.out.println("正解:"+emotions[74]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「虚構の存在に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:同じ肉体で顔の違う科学者が違う結論を導いた者の姿");
                                break;
                                case 2 : System.out.println("ヒント:○○○ドライバー");
                                break;
                                case 3 : System.out.println("ヒント:仮面ライダー○○○で登場する用語の1つ");
                                break;
                                case 4 : System.out.println("ヒント:プロジェクト・○○○");
                                break;
                                case 5 : System.out.println("ヒント:○○○アップ");
                                break;
                                case 6 : System.out.println("gameover"+emotions[74]+":Build \"+\"(=Create, form)\""/*ヒント:○○○が創る明日);
                                break;
                            }
                        }
                    }
                   /*  for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○○が創る明日")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 5 :{
                    System.out.println("愛と平和を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[75];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[75]);
                            break;
                        }
                        /*if(numbers[75]==numbering[75]){
                            System.out.println("正解:"+emotions[75]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「他者への深い感情や情熱を指し、戦争や紛争がない状態や調和を示す」");
                                break;
                                case 2 : System.out.println("ヒント:○○○○○○の世界へ");
                                break;
                                case 3 : System.out.println("ヒント:4人が仮面ライダーとして戦う理由の一つ");
                                break;
                                case 4 : System.out.println("ヒント:仮面ライダービルドに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:葛城忍が科学者になった理由");
                                break; 
                                case 6 : System.out.println("gameover"+emotions[75]+":Love and peace \" +\"(=love & peace)"/*ヒント:愛と平和);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("愛と平和")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 6 :{
                    System.out.println("『「勇気(brave)」だけでなく滅びた小惑星にはなかったもので、共に燃え上がり、絶望を乗り越える人間の魂とされる心の力』を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[76];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[76]);
                            break;
                        }
                        /*if(numbers[76]==numbering[76]){
                            System.out.println("正解:"+emotions[76]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「精神力に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:勇敢であることや恐れを知らぬこと");
                                break;
                                case 2 : System.out.println("ヒント:○○○○イン");
                                break;
                                case 3 : System.out.println("ヒント:真の地球のメロディを聴き、歌うことで○○○○が回復、新たに生み出される");
                                break;
                                case 4 : System.out.println("ヒント:獣電戦隊キョウリュウジャーに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:キョウリュウジャー関連でアツいこと等がある");
                                break;
                                case 6 : System.out.println("gameover"+emotions[76]+":Brave \"+\"(=``Not only 'brave', but also the power of the heart that was not present on the destroyed asteroid, and is said to be the human spirit that burns together and overcomes despair.'')"/*ヒント:強き竜の者であるキョウリュウジャーに変身するために必要な力);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("強き竜の者であるキョウリュウジャーに変身するために必要な力")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 7 :{
                    System.out.println("想像力を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[77];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[77]);
                            break;
                        }
                        /*if(numbers[77]==numbering[77]){
                            System.out.println("正解:"+emotions[77]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「力に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:夢見る力");
                                break;
                                case 2 : System.out.println("ヒント:想像する力");
                                break;
                                case 3 : System.out.println("ヒント:多くの場合は子供にしか宿っておらず、大人になるとそのほとんどが喪失してしまう");
                                break;
                                case 4 : System.out.println("ヒント:列車戦隊トッキュウジャーに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:これを動力とするレインボーラインの列車がある");
                                break;
                                case 6 : System.out.println("gameover"+emotions[77]+":Imagination \"+\"(=imagination)"/*ヒント:トッキュウジャーに変身するために必要な力);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("トッキュウジャーに変身するために必要な力")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 8 :{
                    System.out.println("マイペースに行くを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                       String Changefullthrottle=scanaria(l);
                        x=emotions[78];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[78]);
                            break;
                        }
                        /*if(numbers[78]==numbering[78]){
                            System.out.println("正解:"+emotions[78]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:モカちゃんの感性で決まる");
                                break;
                                case 2 : System.out.println("ヒント:モカちゃんらしい");
                                break;
                                case 3 : System.out.println("ヒント:「興味がわかない物にはとことん無関心だが、好きな人の為には一所懸命になれる様」");
                                break;
                                case 4 : System.out.println("ヒント:BanGDream!ガールズバンドパーティーに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:造語である");
                                break;
                                case 6 : System.out.println("gameover"+emotions[78]+":It's mocha \"+\"(=go at your own pace)"/*ヒント:冗談めかした言動が多いがひょうひょうとした態度の裏側には強く大きな情熱を抱えている);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("冗談めかした言動が多いがひょうひょうとした態度の裏側には強く大きな情熱を抱えている")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 9 :{
                    System.out.println("頑張っているを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[79];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[79]);
                            break;
                        }
                        /*if(numbers[79]==numbering[79]){
                            System.out.println("正解:"+emotions[79]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:「普通が故に努力家で前向き、少しのことではめげないさま」");
                                break;
                                case 2 : System.out.println("ヒント:造語");
                                break;
                                case 3 : System.out.println("ヒント:○○○ともいう");
                                break;
                                case 4 : System.out.println("ヒント:BanGDream!ガールズバンドパーティーに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:○○ってみよ-!");
                                break;
                                case 6 : System.out.println("gameover"+emotions[79]+":I'm confused \"+\"(=doing my best)"/*ヒント:頑張っているさま);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("頑張っているさま")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 10 :{
                    System.out.println("可愛いものに目がない様を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                   String Changefullthrottle=scanaria(l);
                    x=emotions[80];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[80]);
                            break;
                        }
                        /*if(numbers[80]==numbering[80]){
                            System.out.println("正解:"+emotions[80]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:可愛いものに対して暴走する様");
                                break;
                                case 2 : System.out.println("ヒント:造語");
                                break;
                                case 3 : System.out.println("ヒント:かわいいものに目がない");
                                break;
                                case 4 : System.out.println("ヒント:D4DJ grovymixに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:好奇心が強く知識も豊富で、興味のあることには饒舌になる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[80]+":Noah is here \"+\"(=It's like you don't have an eye for cute things)"/*ヒント:「カワイイ」という概念への情景がある);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("「カワイイ」という概念への情景がある")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 11 :{
                    System.out.println("自分を認めてくれる相手には甘えていくが、そうでない相手にはガードが堅い様を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[81];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[81]);
                            break;
                        }
                        /*if(numbers[81]==numbering[81]){
                            System.out.println("正解:"+emotions[81]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:幼馴染に対して愛が重い行動を魅せる");
                                break;
                                case 2 : System.out.println("ヒント:造語");
                                break;
                                case 3 : System.out.println("ヒント:○○○○○時は不機嫌だったりする");
                                break;
                                case 4 : System.out.println("ヒント:D4DJ grovymixに登場する用語の1つ");
                                break;
                                case 5 : System.out.println("ヒント:ネット上で「絵師」として注目を集めている本人");
                                break;
                                case 6 : System.out.println("gameover"+emotions[81]+":be disgusted with \"+\"(=So that I behave like a baby to a partner detecting oneself, but guard is firm for the partner who is not so)"/*ヒント:よさがわからないやつはミュートする);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("よさがわからないやつはミュートする")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 12 :{
                    System.out.println("感情を持つAI（機械族）が感情を持たないAI（機械族）のような行動を取る様を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[82];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[82]);
                            break;
                        }
                        /*if(numbers[82]==numbering[82]){
                            System.out.println("正解:"+emotions[82]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「行動に所属しており、概念に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:AI故に単調な行動を取る様");
                                break;
                                case 2 : System.out.println("ヒント:造語");
                                break;
                                case 3 : System.out.println("ヒント:ネオに心を届けるために存在する");
                                break;
                                case 4 : System.out.println("ヒント:心を得た存在");
                                break;
                                case 5 : System.out.println("ヒント:歌姫アリアの現身に近い存在");
                                break;
                                case 6 : System.out.println("gameover"+emotions[82]+":luminous \"+\"(=The way an AI (machine people) with emotions behaves like an AI (machine people) without emotions.)"/*ヒント:演算結果に順応なAI);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("演算結果に順応なAI")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 13 :{
                    System.out.println("何とも言い表せない素敵な気持ちを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[83];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[83]);
                            break;
                        }
                        /*if(numbers[83]==numbering[83]){
                            System.out.println("正解:"+emotions[83]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:感情に所属している");
                                break;
                                case 1 : System.out.println("ヒント:ある対象に対して感情が変化した時に使用される");
                                break;
                                case 2 : System.out.println("ヒント:感動を表す");
                                break;
                                case 3 : System.out.println("ヒント:俗語");
                                break;
                                case 4 : System.out.println("ヒント:切なさやなつかしさを含む場面が多い");
                                break;
                                case 5 : System.out.println("ヒント:○○○デザイン");
                                break;
                                case 6 : System.out.println("gameover"+emotions[83]+":\"Emotional \"+\"(=What an indescribably wonderful feeling!)"/*ヒント:感情的なさま);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("感情的なさま")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 14 :{
                    System.out.println("小さいもの、弱いものなどに心惹かれる気持ちを抱く様を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[84];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[84]);
                            break;
                        }
                        /*if(numbers[84]==numbering[84]){
                            System.out.println("正解:"+emotions[84]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:感情に所属している");
                                break;
                                case 1 : System.out.println("ヒント:「（小さくて）愛らしい、小さい、同情を誘うばかりに（痛々しく）かわいそうだ」");
                                break;
                                case 2 : System.out.println("ヒント:○○○○アイテム");
                                break;
                                case 3 : System.out.println("ヒント:他と比べて小さいさま");
                                break;
                                case 4 : System.out.println("ヒント:かわいそうだ");
                                break;
                                case 5 : System.out.println("ヒント:共感を高め、信頼に出来る関係性を形成する為");
                                break;
                                case 6 : System.out.println("gameover"+emotions[84]+":Cute \"+\"(=Feeling attracted to small and weak things)"/*ヒント:本気で対象となる事物を○○○○と思っていない場合に用いる);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("本気で対象となる事物を○○○○と思っていない場合に用いる")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 15 :{
                    System.out.println("素晴らしい、最高を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[85];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[85]);
                            break;
                        }
                        /*if(numbers[85]==numbering[85]){
                            System.out.println("正解:"+emotions[85]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:感情に所属している");
                                break;
                                case 1 : System.out.println("ヒント:価値が高い");
                                break;
                                case 2 : System.out.println("ヒント:大切だ");
                                break;
                                case 3 : System.out.println("ヒント:貴重だ");
                                break;
                                case 4 : System.out.println("ヒント:身分が高い");
                                break;
                                case 5 : System.out.println("ヒント:敬うべきだ");
                                break;
                                case 6 : System.out.println("gameover"+emotions[85]+":precious \"+\"(=wonderful, the best)"/*ヒント:「本来の意味を超越するほど素晴らしく、他に比べるものがないくらい好きである」);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("「本来の意味を超越するほど素晴らしく、他に比べるものがないくらい好きである」")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 16 :{
                    System.out.println("時間が重なってできたもの、特定の事象を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[86];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[86]);
                            break;
                        }
                        /*if(numbers[86]==numbering[86]){
                            System.out.println("正解:"+emotions[86]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:物事を忘れずに覚えている事");
                                break;
                                case 2 : System.out.println("ヒント:覚えておくこと");
                                break;
                                case 3 : System.out.println("ヒント:「過去の経験の内容を保持し、後でそれを思い出すこと」");
                                break;
                                case 4 : System.out.println("ヒント:○○障害");
                                break;
                                case 5 : System.out.println("ヒント:ガイアメモリに内包されるもの");
                                break;
                                case 6 : System.out.println("gameover"+emotions[86]+":Memory \"+\"(=Something created by the overlap of time, a specific event)"/*ヒント:地球の本棚に○○されているもの);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("地球の本棚に○○されているもの")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 17 :{
                    System.out.println("存在の数だけ存在する、理想の具現化、偽善、正しい道理を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[87];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[87]);
                            break;
                        }
                        /*if(numbers[87]==numbering[87]){
                            System.out.println("正解:"+emotions[87]);
                            break;
                        } else {
                            switch (i) {
                                case 0:System.out.println("不正解! ヒント:行動に所属しており、概念に位置している");
                                break;
                                case 1:System.out.println("ヒント:この概念同士で対立する");
                                break;
                                case 2:System.out.println("ヒント:脆き者よ、汝の名は○○○なり");
                                break;
                                case 3:System.out.println("ヒント:人間の社会的関係において実現されるべき究極的な価値");
                                break;
                                case 4:System.out.println("ヒント:人間の対他的関係の規律に関わる法的な価値をさす");
                                break;
                                case 5:System.out.println("ヒント:弱者を救い、悪者を懲らしめる人");
                                break;
                                case 6:System.out.println("gameover"+emotions[87]+":justice \"+\"(=embodiment of the ideal,hypocrisy,correct reason, a righteous principle that exists as many as there are)\""/*ヒント:○○は巡る);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○は巡る")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 18 :{
                    System.out.println("姓名も社会も文明も全て無に還すを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[88];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+"gameover"+emotions[88]+":Love And Hate");
                            break;
                        }
                        /*if(numbers[88]==numbering[88]){
                            System.out.println("正解:"+emotions[88]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:行動に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:共犯者のみが偉業と称えた行動");
                                break;
                                case 2 : System.out.println("ヒント:○○的な○のこと");
                                break;
                                case 3 : System.out.println("ヒント:「本人は悪い事と全く思っていないが、私利私欲や興味関心のためにどう考えても他人にとっては迷惑極まりない行為を平然と行う」");
                                break;
                                case 4 : System.out.println("ヒント:憎まれることこそ悪の本懐");
                                break;
                                case 5 : System.out.println("ヒント:「悪いことをしたくて悪事を働き、なおかつそこに何も思うところがない」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[88]+":absolute evil \"+\"(=Names, society, and civilization will all be reduced to nothing.)"/*ヒント:必要悪とは異なる);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("必要悪とは異なる")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 19 :{
                    System.out.println("運命共同体を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[89];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[89]);
                            break;
                        }
                        /*if(numbers[89]==numbering[89]){
                            System.out.println("正解:"+emotions[89]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:集団に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:演奏に必要なメンバーが全て揃っている状態");
                                break;
                                case 2 : System.out.println("ヒント:一般にロックを演奏する事を目的");
                                break;
                                case 3 : System.out.println("ヒント:通信における帯域幅");
                                break;
                                case 4 : System.out.println("ヒント:通信路容量");
                                break;
                                case 5 : System.out.println("ヒント:バンドリでは12以上の○○○が存在する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[89]+":Band \"+\"(=Common destiny)"/*ヒント:次世代ガールズ○○○プロジェクト);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("次世代ガールズ○○○プロジェクト")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 20 :{
                    System.out.println("「ダンス・クラブやディスコでレコードを選択し、プレーする人」、存在と音楽を繋ぐのを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[90];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+"gameover"+emotions[90]+":Love And Hate");
                            break;
                        }
                        /*if(numbers[90]==numbering[90]){
                            System.out.println("正解:"+emotions[90]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:職業に所属しており、概念に位置している");
                                break;
                                case 1 :System.out.println("ヒント:バンドやユニットに参加している人もいる");
                                break;
                                case 2 : System.out.println("ヒント:ラジオ○○とクラブ○○の2種類の職業がある");
                                break;
                                case 3 : System.out.println("ヒント:○○ミキサー");
                                break;
                                case 4 : System.out.println("ヒント:トラックメイカーも兼ねる○○は、○○Remix");
                                break;
                                case 5 : System.out.println("ヒント:D○○400ハピアラモデル");
                                break;
                                case 6 : System.out.println("gameover"+emotions[90]+":DJ \"+\"(=``The person who selects and plays records at dance clubs and discos'', the person who connects existence and music.)"/*ヒント:「○○*アニメ*ゲームでおくる、全く新しいメディアミックスプロジェクトD4○○」);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("「○○*アニメ*ゲームでおくる、全く新しいメディアミックスプロジェクトD4○○」")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 21 :{
                    System.out.println("多数の要素が集ま手まとまりを持った組織や体系のことを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[91];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[91]);
                            break;
                        }
                        /*if(numbers[91]==numbering[91]){
                            System.out.println("正解:"+emotions[91]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:相互に影響をおよぼしあう要素から構成される");
                                break;
                                case 2 : System.out.println("ヒント:まとまりや仕組みの全体");
                                break;
                                case 3 : System.out.println("ヒント:AI○○○○");
                                break;
                                case 4 : System.out.println("ヒント:目的を遂行するための体系や組織の意味");
                                break;
                                case 5 : System.out.println("ヒント:「コンピュータ分野、自然科学分野などを中心に幅広い分野で使われる」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[91]+":System \"+\"(=An organization or system in which many elements come together in a cohesive manner.)"/*ヒント:対義語として部品や要素を表す「モジュール」「パーツ」がある);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("対義語として部品や要素を表す「モジュール」「パーツ」がある")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 22 :{
                    System.out.println("非常に稀有な「才能」たる転職に関連した能力を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[92];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[92]);
                            break;
                        }
                        /*if(numbers[92]==numbering[92]){
                            System.out.println("正解:"+emotions[92]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:力に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:あることを行うための技術的な能力");
                                break;
                                case 2 : System.out.println("ヒント:ドイツ語でFähigkeitを意味する");
                                break;
                                case 3 : System.out.println("ヒント:「物を作る仕事などに関し、それを巧みに（見事に）してのけることが出来る腕前」");
                                break;
                                case 4 : System.out.println("ヒント:表面的な召喚ボーナスは言語理解と錬成");
                                break;
                                case 5 : System.out.println("ヒント:潜在能力は○○の個数の分だけ分散する");
                                break;
                                case 6 : System.out.println("gameover"+emotions[92]+":Skill \"+\"(=Ability related to changing jobs as a very rare “talent”)"/*ヒント:「魔物肉を直接食し、肉体を回復することで取得出来、取得者が出来る項目が増加することで派生として現れる」);
                            break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("「魔物肉を直接食し、肉体を回復することで取得出来、取得者が出来る項目が増加することで派生として現れる」")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 23 :{
                    System.out.println("「攻撃・防御の正確さ、精密さ」を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[93];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[93]);
                            break;
                        }
                        /*if(numbers[93]==numbering[93]){
                            System.out.println("正解:"+emotions[93]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:方法に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:巧みに行う技・技巧・技芸");
                                break;
                                case 2 : System.out.println("ヒント:ドイツ語でTechnologieを意味する");
                                break;
                                case 3 : System.out.println("ヒント:「科学の原理を（産業や医療・事務などの活動に）役立てて、物を生産したり組織したりするしかた・わざ」");
                                break;
                                case 4 : System.out.println("ヒント:物事を巧みに（能率的に）行う技");
                                break;
                                case 5 : System.out.println("「ヒント:スナイパーを除いて○○のある隊員は戦闘能力の高い人物が多く、○○の高さはその隊員の強さに影響している事が多いです。」");
                                break;
                                case 6 : System.out.println("gameover"+emotions[93]+":Technology \"+\"(=Accuracy and precision of attack and defense)"/*ヒント:からめ手を得意とする隊員が特殊○○が高い);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("からめ手を得意とする隊員が特殊○○が高い")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 24 :{
                    System.out.println("「8種の系統を持ち、神聖力を消費する」を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[94];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[94]);
                            break;
                        }
                        /*if(numbers[94]==numbering[94]){
                            System.out.println("正解:"+emotions[94]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:力に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:「暗黒術とも呼ばれ、神聖力或いは空間リソースと呼ばれるものを消費する」");
                                break;
                                case 2 : System.out.println("ヒント:システムコールで始まる");
                                break;
                                case 3 : System.out.println("ヒント:SAOアリシゼーション編に出てくる用語の1つである");
                                break;
                                case 4 : System.out.println("ヒント:神器が宿した記憶を開放する超高等○○○");
                                break;
                                case 5 : System.out.println("ヒント:武装完全支配術、記憶開放術が含まれる");
                                break;
                                case 6 : System.out.println("gameover"+emotions[94]+":Sacred art \"+\"(=It has 8 different strains and consumes divine power.)"/*ヒント:全8種存在する);
                                break;
                            }
                        }
                    }
                   /*  for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("全8種存在する")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 25 :{
                    System.out.println("歌を歌う事を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[95];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[95]);
                            break;
                        }
                        /*if(numbers[95]==numbering[95]){
                            System.out.println("正解:"+emotions[95]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:行動に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:声を用いて音楽を作り出すことをいう");
                                break;
                                case 2 : System.out.println("ヒント:ドイツ語でSingenを意味する");
                                break;
                                case 3 : System.out.println("ヒント:「調の使用、リズム、持続音など様々な発声技術によって通常の音声を強化することで行われる」");
                                break;
                                case 4 : System.out.println("ヒント:○○を行う人を歌手と言う");
                                break;
                                case 5 : System.out.println("ヒント:異なる音程の声を歌う歌手による○○団");
                                break;
                                case 6 : System.out.println("gameover"+emotions[95]+":Singing \"+\"(=singing a song)"/*ヒント:AI○○ソフトが存在している);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("AI○○ソフトが存在している")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 26 :{
                    System.out.println("分からないことにルールを探す地道な努力を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[96];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[96]);
                            break;
                        }
                        /*if(numbers[96]==numbering[96]){
                            System.out.println("正解:"+emotions[96]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:学問に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:発達しすぎた○○は魔法と区別がつかないと言われる");
                                break;
                                case 2 : System.out.println("ヒント:一定の目的・方法のもとに種種の事象を研究する認識活動");
                                break;
                                case 3 : System.out.println("ヒント:その成果としての体系知識");
                                break;
                                case 4 : System.out.println("ヒント:自然○○だけを指す場合もある");
                                break;
                                case 5 : System.out.println("ヒント:日本○○未来館");
                                break;
                                case 6 : System.out.println("gameover"+emotions[96]+":Science \"+\"(=Steady efforts to find rules for things we don't understand)"/*ヒント:○○知識);
                                break;
                            }
                        }
                    }
                   /*  for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○知識")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 27 :{
                    System.out.println("音による芸術、器楽と声楽がある、人間に秘められた力を開放するものを変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[97];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[97]);
                            break;
                        }
                        /*if(numbers[97]==numbering[97]){
                            System.out.println("正解:"+emotions[97]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:学問に所属しており、概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:音による時間の表現");
                                break;
                                case 2 : System.out.println("ヒント:○○の要素には、リズム、メロディー、ハーモニ―の3要素をもとに、主題、形式、調性、拍子、テンポ、楽器によって構成されます");
                                break;
                                case 3 : System.out.println("ヒント:直接心身に影響するものと、○○そのものの基盤として間接的に影響するものがあります");
                                break;
                                case 4 : System.out.println("ヒント:バンドリ！オフィシャルバンドスコアが登場している");
                                break;
                                case 5 : System.out.println("ヒント:D4DJgrovymixでは原曲のボーカルでリズムゲームが出来る");
                                break;
                                case 6 : System.out.println("gameover"+emotions[97]+":Music \"+\"(=Art by sound, instrumental music and vocal music, something that releases the power hidden in humans.)"/*ヒント:Remixすれば曲の印象が変わる);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("Remixすれば曲の印象が変わる")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 28 :{
                    System.out.println("時空全体、前後左右上下に広がる空間と過去から未来に伸びる時間をひっくるめたもの、「共感覚によって曲が変わる度に会場全体の音、人の気持ちの色が変わる」を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[98];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[98]);
                            break;
                        }
                        /*if(numbers[98]==numbering[98]){
                            System.out.println("正解:"+emotions[98]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:秩序ある統一体としての世界");
                                break;
                                case 2 : System.out.println("ヒント:あらゆる天体の存在する空間");
                                break;
                                case 3 : System.out.println("ヒント:ビッグバンによって生まれた");
                                break;
                                case 4 : System.out.println("ヒント:物体が○○の果てまで飛び去ることが出来る初速度の最小値を第二○○速度");
                                break;
                                case 5 : System.out.println("ヒント:コズミックエナジーが存在する空間");
                                break;
                                case 6 : System.out.println("gameover"+emotions[98]+":Universe \"+\"(=The entire space and time, a space that extends forward, backward, left, right, up and down, and time that extends from the past to the future.``Every time the song changes due to synesthesia, the sound of the entire venue and the color of people's feelings change.'')"/*ヒント:○○で唯一の”魂のパートナー”「ソウルバディ」);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("○○で唯一の”魂のパートナー”「ソウルバディ」")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                case 29 :{
                    System.out.println("星の理を捻じ曲げる理法術と呼ばれる魔法の名を示す、下界に神の居る時代を変換したものは何？");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[99];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[99]);
                            break;
                        }
                        /*if(numbers[99]==numbering[99]){
                            System.out.println("正解:"+emotions[99]);
                            break;
                        } else {
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:概念に位置している");
                                break;
                                case 1 : System.out.println("ヒント:その名の付く魔法を全て会得することで概念魔法に至る");
                                break;
                                case 2 : System.out.println("ヒント:ドイツ語でZeitalter der Götterを意味する");
                                break;
                                case 3 : System.out.println("ヒント:日本神話における時代区分");
                                break;
                                case 4 : System.out.println("ヒント:○○凛子博士");
                                break;
                                case 5 : System.out.println("ヒント:○○兄妹");
                                break;
                                case 6 : System.out.println("gameover"+emotions[99]+":Age of gods \"+\"(=An era in which there were gods in the lower world, showing the name of the magic known as Logic that twisted the principles of the stars.)6"/*ヒント:図説○○文字入門);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("図説○○文字入門")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
                default :{
                    System.out.println("問題");
                    System.out.println("回答を入力して下さい");
                    for(int i=0;i<7;i++){
                        String Changefullthrottle=scanaria(l);
                        x=emotions[0];
                        if(Changefullthrottle.equals(x)){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        }
                        /*if(numbers[0]==numbering[0]){
                            System.out.println("正解:"+emotions[0]);
                            break;
                        } else{
                            switch (i) {
                                case 0 : System.out.println("不正解! ヒント:「所属に所属しており、位置に位置している」");
                                break;
                                case 1 : System.out.println("ヒント:");
                                break;
                                case 2 : System.out.println("ヒント:");
                                break;
                                case 3 : System.out.println("ヒント:");
                                break;
                                case 4 : System.out.println("ヒント:");
                                break;
                                case 5 : System.out.println("ヒント:");
                                break;
                                case 6 : System.out.println("gameover"+emotions[0]+":null"/*ヒント:);
                                break;
                            }
                        }
                    }
                    /*for(int a=0;a<hint.length;a++){
                        String m=hint[a];
                        String Changefullthrottle="0";
                        if(m.equals("")){
                            System.out.println("正解:"+conversion(Changefullthrottle));
                            break;
                        }
                    }
                };
                break;
            }
        }
    }

}*/