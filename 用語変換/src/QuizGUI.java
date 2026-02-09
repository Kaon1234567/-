import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

class BGMPlayer {
    private String filePath;
    public BGMPlayer(String filePath) {
        this.filePath = filePath;
    }
    public void play() {
        // 音楽再生処理をここに実装（ダミー）
        System.out.println("Playing BGM: " + filePath);
    }
    public void stop() {
        // 音楽停止処理をここに実装（ダミー）
        System.out.println("Stopping BGM: " + filePath);
    }
}

public class QuizGUI extends JFrame implements ActionListener {
    JLabel questionLabel;
    JTextField answerTextField;
    private JButton submitButton;
    private JLabel imageLabel; // 画像表示用ラベル
    
    App quiz; // Assuming 'App' and 'Question' are defined elsewhere
    Question currentQuestion;
    
    private int questionCount = 0;
    private int correctCount = 0;
    private int hintCount = 0;
    private int hintIndex = 0;
    private int incorrectCount = 0;

 // BGMPlayerのインスタンスを追加
    private BGMPlayer bgmPlayer;

    public QuizGUI() {
        quiz = new App(); // App class must be defined
        setTitle("Java Quiz");
        setSize(400, 350); // ウィンドウサイズを少し大きくする
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        questionLabel = new JLabel("問題が表示されます...");
        add(questionLabel);

        answerTextField = new JTextField(20);
        add(answerTextField);

        submitButton = new JButton("解答");
        submitButton.addActionListener(this); // Attach the QuizGUI class as the listener
        add(submitButton);
        
        // 画像表示用のJLabelを初期化
        imageLabel = new JLabel();
        add(imageLabel);

        // BGMを初期化し、再生を開始
        // "path/to/your/music.mp3" を実際の音楽ファイルへのパスに置き換えてください
        bgmPlayer = new BGMPlayer("世界に楽しいを届けて(カスタマイズ)");
        bgmPlayer.play();

        loadNextQuestion();
        setVisible(true);
    }
    
    public void loadNextQuestion() {
        currentQuestion = quiz.getRandomQuestion();
        questionLabel.setText("第 " + (questionCount + 1) + " 問: " + currentQuestion.question);
        answerTextField.setText("");
        hintIndex = 0; // Reset hint index for each new question
        imageLabel.setIcon(null); // 画像を非表示にする
    }

    // 画像を表示する共通メソッド
    private void showImage(String imagePath) {
        try {
            ImageIcon icon = new ImageIcon(imagePath);
            imageLabel.setIcon(icon);
            // 画像の位置を中央に設定
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        } catch (Exception e) {
            System.err.println("画像の読み込みに失敗しました: " + imagePath);
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String userAnswer = answerTextField.getText();

            // Handle hint request
            if (userAnswer.trim().equals("ヒント")) {
                if (currentQuestion.hint != null && currentQuestion.hint.length > 0) {
                    JOptionPane.showMessageDialog(this, "ヒント: " + currentQuestion.hint[hintIndex]);
                    showImage("シフォン.png"); // ヒント画像を表示
                    hintIndex = (hintIndex + 1) % currentQuestion.hint.length; // Cycle through hints
                    hintCount++;
                } else {
                    JOptionPane.showMessageDialog(this, "ヒントはありません。");
                }
                return; // Don't proceed with question logic after a hint
            }
            
            //questionCount++; // Increment question count for an actual answer
            
            // Check for the end of the quiz
            /*if (questionCount > 5) {
                JOptionPane.showMessageDialog(this, "クイズ終了！\n正解数: " + correctCount + "\n不正解数: " + incorrectCount + "\nヒント使用回数: " + hintCount);
                System.exit(0);
                return;
            }*/

            // Check the user's answer
            if (userAnswer.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "解答を入力してください。");
                // Don't load next question if the field is empty
            } else if (userAnswer.trim().equals(currentQuestion.answer)) {
                JOptionPane.showMessageDialog(this, "正解！");
                showImage("マル.png"); // 正解画像を表示
                showImage("新道鈴夏.png"); // 正解時の画像を表示
                correctCount++;
                //loadNextQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "不正解。正解は: " + currentQuestion.answer);
                JOptionPane.showMessageDialog(this,"英語式:"+currentQuestion.english);
                showImage("バツ.png"); // 不正解画像を表示
                showImage("阿鹿有馬.png"); // 不正解時の画像を表示
                incorrectCount++;
                //loadNextQuestion();
            }
            questionCount++; // Increment question count for an actual answer
            // Check for the end of the quiz
            if (questionCount >= 5) {
                // クイズ終了時に音楽を停止
                if (bgmPlayer != null) {
                    bgmPlayer.stop();
                }
                showImage("シフォン.png"); // 結果画像を表示
                JOptionPane.showMessageDialog(this, "クイズ終了！\n正解数: " + correctCount + "\n不正解数: " + incorrectCount + "\nヒント使用回数: " + hintCount);
                System.exit(0);
            }else{
                loadNextQuestion(); // Load the next question after processing the answer
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new QuizGUI();
        });
    }
}

/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QuizGUI extends JFrame implements ActionListener {
    JLabel questionLabel;
    JTextField answerTextField;
    private JButton submitButton;
    //JButton submitButton;
    App quiz;
    Question currentQuestion;
    private int questionCount = 0; // 問題数をカウントする変数
    private int count = 0; // 正解数をカウントする変数
    private int hintcount = 0; // ヒント数をカウント
    private int hintIndex = 0; // ヒントのインデックス
    private int uncount = 0; // 不正解数をカウントする変数

    public QuizGUI() {
        quiz = new App();
        setTitle("Java Quiz");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        questionLabel = new JLabel();
        add(questionLabel);

        answerTextField = new JTextField(20);
        add(answerTextField);

        submitButton = new JButton("解答");
        //submitButton.addActionListener(this);
        //submitButton.addActionListener(new SubmitButtonListener()); // 別のクラスでActionListenerを実装
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == submitButton) {
                    questionCount++; // 問題数をカウント
                    if (questionCount > 5) { // 5問を超えたら終了
                        JOptionPane.showMessageDialog(QuizGUI.this, "クイズ終了！\n正解数: " + count + "\nヒント数: " + hintcount + "\n不正解数: " + uncount);
                        System.exit(0);
                    }
                    String userAnswer = answerTextField.getText();
                    if (userAnswer.equals(currentQuestion.answer)) {
                        JOptionPane.showMessageDialog(QuizGUI.this, "正解！");
                        count++; // 正解数をカウント
                    } else if (userAnswer.isEmpty()) {
                        JOptionPane.showMessageDialog(QuizGUI.this, "解答を入力してください。");
                    } else if (userAnswer.equals("ヒント")) {
                        JOptionPane.showMessageDialog(QuizGUI.this, "ヒント: " + currentQuestion.hint[0]);
                        hintcount++; // ヒント数をカウント
                    } else {
                        JOptionPane.showMessageDialog(QuizGUI.this, "不正解。正解は: " + currentQuestion.answer);
                        uncount++; // 不正解数をカウント
                    }
                    loadNextQuestion();
                }
            }
        });
        add(submitButton);

        // Avoid calling overridable method in constructor
        currentQuestion = quiz.getRandomQuestion();
        questionLabel.setText(currentQuestion.question);
        answerTextField.setText("");
        setVisible(true);
    }

    public void loadNextQuestion() {
        currentQuestion = quiz.getRandomQuestion();
        questionLabel.setText(currentQuestion.question);
        answerTextField.setText("");
    }
 //private class SubmitButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            questionCount++; // 問題数をカウント
                    if (questionCount > 5) { // 5問を超えたら終了
                        JOptionPane.showMessageDialog(QuizGUI.this, "クイズ終了！\n正解数: " + count + "\nヒント数: " + hintcount + "\n不正解数: " + uncount);
                        System.exit(0);
                    }
            String userAnswer = answerTextField.getText();
            if (userAnswer.equals(currentQuestion.answer)) {
                JOptionPane.showMessageDialog(this, "正解！");
                count++; // 正解数をカウント
            } else if (userAnswer.isEmpty()) {
                JOptionPane.showMessageDialog(this, "解答を入力してください。");   
            }else if(userAnswer.equals("ヒント")){
                JOptionPane.showMessageDialog(this, "ヒント: " + currentQuestion.hint[hintIndex]);
                hintIndex = (hintIndex + 1) % currentQuestion.hint.length; // ヒントのインデックスを更新
                if (hintIndex == 0) {
                    hintIndex = 0; // ヒントのインデックスをリセット
                }
                hintcount++; // ヒント数をカウント
            }else {
                JOptionPane.showMessageDialog(this, "不正解。正解は: " + currentQuestion.answer);
                uncount++; // 不正解数をカウント
            }
            loadNextQuestion();
        }
    }
 //}
    public static void main(String[] args) {
        //new QuizGUI();
        SwingUtilities.invokeLater(() -> { // イベントディスパッチスレッドでGUIを初期化
            QuizGUI quizGUI = new QuizGUI();
            quizGUI.setVisible(true);
        });
    }
}*/
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGame extends JFrame {

    private JLabel questionLabel;
    private JRadioButton[] answerButtons;
    private JButton answerButton;
    private ButtonGroup answerGroup;

    public QuizGame() {
        setTitle("Java クイズゲーム");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // 問題表示エリア
        JPanel questionPanel = new JPanel();
        questionLabel = new JLabel("問題文");
        questionPanel.add(questionLabel);
        add(questionPanel, BorderLayout.NORTH);

        // 解答選択肢
        JPanel answerPanel = new JPanel();
        answerButtons = new JRadioButton[4];
        answerGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JRadioButton("選択肢" + (i + 1));
            answerGroup.add(answerButtons[i]);
            answerPanel.add(answerButtons[i]);
        }
        add(answerPanel, BorderLayout.CENTER);

        // 解答ボタン
        answerButton = new JButton("解答");
        answerButton.addActionListener(new AnswerButtonListener());
        add(answerButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 解答ボタンのイベントハンドラ
    class AnswerButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 解答処理
            System.out.println("解答ボタンが押されました");
        }
    }

    public static void main(String[] args) {
        new QuizGame();
    }
}
    class AnswerButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedAnswer = -1;
        for (int i = 0; i < answerButtons.length; i++) {
            if (answerButtons[i].isSelected()) {
                selectedAnswer = i;
                break;
            }
        }

        if (selectedAnswer == -1) {
            JOptionPane.showMessageDialog(QuizGame.this, "解答を選択してください。");
            return;
        }

        if (isCorrectAnswer(selectedAnswer)) {
            JOptionPane.showMessageDialog(QuizGame.this, "正解！");
            // 次の問題へ
            displayNextQuestion();
        } else {
            JOptionPane.showMessageDialog(QuizGame.this, "不正解！");
        }
    }

    private boolean isCorrectAnswer(int selectedAnswer) {
        // 正解判定ロジック
        return selectedAnswer == 1; // 例: 選択肢2が正解
    }

    private void displayNextQuestion() {
        // 次の問題を表示する処理
        // 問題と解答を更新
        questionLabel.setText("次の問題文");
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText("次の選択肢" + (i + 1));
        }
        answerGroup.clearSelection(); // 解答選択肢をクリア
    }
}*/