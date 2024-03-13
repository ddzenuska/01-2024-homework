package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 2;
    private static final VideoStore videoStore = new VideoStore(); /* instance variable for this class, for a constant
    reference to the videoStore, so that it can be accessed throughout the whole class. */

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to display video inventory");
            System.out.print("\tYour choice: ");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.out.println("\nThank you for using our service. Have a good day!");
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4: // added another case which displays video inventory for the user.
                    displayVideoInventory();
                    break;
                default:
                    System.err.println("Invalid input.");
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            scanner.nextLine(); // To consume all the new line characters. In this case all-words of a movie title.
            System.out.print("\nEnter movie name: ");
            String movieName = scanner.nextLine();

            System.out.print("Enter rating: ");
            double rating = scanner.nextDouble();
            Video video = new Video(movieName, "Available", rating);
            videoStore.addVideo(video);
        }
        System.out.println("\nVideo store is full now.");
    }

    private static void rentVideo(Scanner scanner) {
        displayVideoInventory(); // to print video inventory, so user can choose easier.

        scanner.nextLine(); // to consume all character inputs for the "titleRented".
        System.out.print("Enter the title you would like to rent: ");
        String titleRented = scanner.nextLine();

        Video rentedVideo = videoStore.checkOut(titleRented);

        if (rentedVideo != null) {
            System.out.println("\nVideo rented successfully:\n" + rentedVideo.getTitle());
        } else {
            System.out.println("\nVideo not found or not available.");
        }
    }

    private static void returnVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.print("\nEnter video title you would like to return: ");
        String titleReturned = scanner.nextLine();

        videoStore.returnVideo(titleReturned);
    }

    private static void displayVideoInventory() {
        List<Video> allVideos = videoStore.allContent(); // method call instead of iteration.

        if (allVideos.isEmpty()) {
            System.out.println("\nNo videos available at the moment.");
        } else {
            System.out.println("\nVideo store inventory: ");
            for (Video video : allVideos) {
                System.out.println("\tTitle: " + video.getTitle() +
                        "\n\tStatus: " + video.getFlag() +
                        "\n\tRating: " + video.getRating() + "\n");
            }
        }
    }
}


//  Video - to model the video.
class Video {
    private String title;
    private String flag;
    private double rating;

    public Video(String title, String flag, double rating) { // constructor for creating video instances.
        this.title = title;
        this.flag = flag;
        this.rating = rating;
    }

    public void checkOut() {
        this.flag = "Check out";
    }

    public void returnVideo() {
        this.flag = "Available";
    }

    public String getTitle() {
        return title;
    }

    public String getFlag() {
        return flag;
    }

    public double getRating() {
        return rating;
    }
}


//  Video store - model of the store.
class VideoStore {
    private final List<Video> videos = new ArrayList<>(); /* holds values of type Video, creating a constant reference
    to videos throughout this class.*/

    public void addVideo(Video video) {
        videos.add(video);
    }

    public Video checkOut(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title) && video.getFlag().equals("Available")) {
                video.checkOut();
                return video;
            }
        }
        return null;
    }

    public void returnVideo(String title) { // iterates videos, finds a match and makes video "Available" if input is valid.
        for (Video video : videos) {
            if (video.getTitle().equals(title) && video.getFlag().equals("Check out")) {
                video.returnVideo();
                System.out.println("\nVideo returned. Thank you!");
                return;
            }
        }
        System.out.println("\nVideo couldn't be returned. Please try again.");
    }

    public List<Video> allContent() {
        return videos;
    } // for the "displayVideoInventory" method
}