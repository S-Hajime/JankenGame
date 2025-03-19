import java.util.Scanner;
import java.util.Random;

public class JankenGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // じゃんけんの選択肢
        String[] hands = {"グー", "チョキ", "パー"};

        System.out.println("じゃんけんゲームを開始します！");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        System.out.print("あなたの手を選んでください: ");
        
        int playerChoice = scanner.nextInt(); // ユーザーの選択
        int computerChoice = random.nextInt(3); // コンピュータの選択 (0〜2のランダムな数)
        
        // 選択した手を表示
        System.out.println("あなたの手: " + hands[playerChoice]);
        System.out.println("コンピュータの手: " + hands[computerChoice]);
        
        // 勝敗判定
        if (playerChoice == computerChoice) {
            System.out.println("引き分けです！");
        } else if ((playerChoice == 0 && computerChoice == 1) || 
                   (playerChoice == 1 && computerChoice == 2) || 
                   (playerChoice == 2 && computerChoice == 0)) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです…");
        }

        scanner.close();
    }
}