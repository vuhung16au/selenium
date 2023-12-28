package com.vuhung.seleniium.features.login;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {

    public static List<WordpressUser> loadCSV(String csvFile) {
        List<WordpressUser> usersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the CSV header (if any)
            String line = br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                WordpressUser user = new WordpressUser();

                // Assuming the CSV columns order is No, Username, Password
                // Adjust indexes accordingly if the order is different
                user.setUserName(data[1].trim());
                user.setPassword(data[2].trim());

                usersList.add(user);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return usersList;
    }
}
