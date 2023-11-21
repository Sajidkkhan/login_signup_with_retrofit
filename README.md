# login_signup_with_retrofit
The is an android project developed in java to access remote data using retrofit library. Basic login and signup features are developed.
The project also contains database and web services(php) files-"retrofit.zip". just extract the zip and get the files.
Steps to work with Retrofit and localhost.

1. Install XAMP

2. Open phpMyadmin and import database ‘utem_db’.

3. Put retrofit web service “.php” files into your hotdocs directory of the XAMP application folders.

4. Launch android studio, import android project.

5. Open ‘RetrofitClient.java’ class and change the BASE URL into your’s. If you are working with localhost, replace the IP address in the base URL.
   To find your IP Address:
   If you are using Windows, launch cmd and type "ipconfig", you will get ipv4 address.
   If you are using Mac, launch terminal and type "ifconfig", you will get inet address (your ipv4 address).

8. Run the project. 
