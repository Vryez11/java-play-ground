package main.java.study.start.oop1;

public class OopProgramming {

    public static void main(String[] args) {

        /*
        int volume = 0;
        boolean isOn = false;

        // 음악 켜기
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
         */

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);

        System.out.println("------");
        System.out.println("객체 지향 프로그래밍 뮤직플레이어");
        System.out.println("------");

        // 객체 지향
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.showState();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.volumeDown();
        player.volumeDown();
        player.showState();
        player.off();
    }

    private static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    private static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    private static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public static class MusicPlayerData {
        int volume = 0;
        boolean isOn = false;
    }

    public static class MusicPlayer {

        int volume = 0;
        boolean isOn = false;

        void on() {
            System.out.println("음악 플레이어를 시작합니다.");
            isOn = true;
        }

        void off() {
            System.out.println("음악 플레이어를 종료합니다.");
            isOn = false;
        }

        void volumeUp() {
            volume++;
            System.out.println("음악 플레이어 볼륨: " + volume);
        }

        void volumeDown() {
            volume--;
            System.out.println("음악 플레이어 볼륨: " + volume);
        }

        void showState() {
            System.out.println("음악 플레이어 상태 확인");
            if (isOn) {
                System.out.println("음악 플레이어 ON, 볼륨: " + volume);
            } else {
                System.out.println("음악 플레이어 OFF");
            }
        }
    }
}
