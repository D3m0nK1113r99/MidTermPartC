/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author d3m0n
 */
public class testUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the available genres and prompt the user to choose one
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }
        System.out.print("Choose your favorite genre (enter a number): ");
        int choice = scanner.nextInt();

        // Create the user's profile with the chosen name and genre
        String genre = genres[choice-1];
        UserProfile userProfile = new UserProfile(name, genre);

        // Display a message that the user's profile was created
        System.out.println("User profile created:");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite genre: " + userProfile.getGenre());
    }
}
