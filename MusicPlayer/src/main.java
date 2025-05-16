import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

class song{
    private int duration;
    private String artist;
    private String name;

     song(int duration,String artist,String name){
         this.duration = duration;
         this.artist= artist;
         this.name = name;
     }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
    public String getDetails(){
         return name + " by "+ artist;
    }


    public void play(){
         System.out.println(getName() + "song is playing of artist" + getArtist());
     }

}
class MusicPlayer {
    private String name;

    private song[] playlist = new song[50];
    private int songCount = 0;
    private int CurrentIndex = -1;

    public void addSong(song Song) {
        if (songCount < playlist.length) {
            playlist[songCount] = Song;
            songCount++;
            if (CurrentIndex == -1) {
                CurrentIndex = 0;
            }
        } else {
            System.out.println("playlist is full");
        }

    }

    public void removeSong(String name) {
        boolean found = false;
        for (int i = 0; i < songCount; i++) {
            if (playlist[i].getName().equals(name)) {
                for (int j = i; j < songCount - 1; j++) {
                    playlist[j] = playlist[j + 1];
                }
                playlist[songCount - 1] = null;
                songCount--;
                if (CurrentIndex >= songCount) {
                    CurrentIndex = songCount - 1;
                }
                found = true;
                System.out.println("Song Removed !");
                break;
            }
        } if (!found) {
            System.out.println("song not found");
        }
    }

    public void playCurrentSong(){
        if(CurrentIndex > 0 && CurrentIndex <songCount){
            playlist[CurrentIndex].play();
        }else{
            System.out.println("no song to play");
        }
    }
    public void nextSong(){
        if(CurrentIndex >= 0 && CurrentIndex <songCount ){
            playlist[CurrentIndex].play();

        }else{
            System.out.println("no song to play");
        }
    }
    public void playNextSong(){
        if(CurrentIndex < songCount -1){
            CurrentIndex++;
            System.out.println("song is playing");
        }else{
            System.out.println("you have reached end of the playlist");
        }
    }
    public void playPreviousSong(){
        if(CurrentIndex >0){
            CurrentIndex--;
            playCurrentSong();
        }else{
            System.out.println("no song to play");
        }
    }
    public void viewPlaylist(){
        if(songCount == 0){
            System.out.println("No song to play");
        }else{
            for(int i = 0;i<songCount;i++){
                System.out.println((i+1) + "." + playlist[i].getDetails());
            }
        }
    }

}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer musicPlayer = new MusicPlayer();

        System.out.println("🎵 Welcome to Console Music Player 🎵");

        while (true) {
            System.out.println("\nChoose the option from the menu:");
            System.out.println(" 1. ADD SONG");
            System.out.println(" 2. REMOVE SONG");
            System.out.println(" 3. PLAY CURRENT SONG");
            System.out.println(" 4. PLAY NEXT SONG");
            System.out.println(" 5. PLAY PREVIOUS SONG");
            System.out.println(" 6. VIEW PLAYLIST");
            System.out.println(" 7. EXIT");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Add the duration: ");
                    int duration = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter the artist of the song: ");
                    String artist = sc.nextLine();

                    System.out.print("Enter the name of the song: ");
                    String name = sc.nextLine();

                    song s = new song(duration, artist, name);
                    musicPlayer.addSong(s);
                    System.out.println("Song added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the name of the song you want to remove: ");
                    String songToRemove = sc.nextLine();
                    musicPlayer.removeSong(songToRemove);
                    break;

                case 3:
                    musicPlayer.playCurrentSong();
                    break;

                case 4:
                    musicPlayer.playNextSong();
                    break;

                case 5:
                    musicPlayer.playPreviousSong();
                    break;

                case 6:
                    musicPlayer.viewPlaylist();
                    break;

                case 7:
                    System.out.println("Exiting Music Player. Goodbye!");
                    return;

                default:
                    System.out.println("Please enter a correct choice.");
            }
        }
    }
}



