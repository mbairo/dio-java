package com.iphone.functions.Gerenciador;

import com.iphone.functions.music.Music;
import com.iphone.functions.phone.Phone;
import com.iphone.functions.internet.Internet;

public class Gerenciador implements Music, Phone, Internet {
    // Music
    public void showMusicList () {
        System.out.println("Showing Song List");
    }
    public void play(){
        System.out.println("Playing Mucic");
    }
    public void pause() {
        System.out.println("Music Paused");
    }

    // Phone
    public void openKeyboard () {
        System.out.println("Showying Keypad");
    }
    public void closeKeyboard () {
        System.out.println("Closed Keypad");
    }    
    public void openContactBook () {
        System.out.println("Mostrando Schedule");
    }
    public void closeContactBook () {
        System.out.println("Closed Schedule");
    }
    public void calling() {
        System.out.println("Calling");
    }
    public void endingCall(){
        System.out.println("Call Closed");
    }
    public void voiceMailInitialized(){
        System.out.println("Voicemail initialized");
    }
    public void voicemailClosed() {
        System.out.println("Voicemail Closed");
    }

    // Internet
    public void openBrowser () {
        System.out.println("Opening browser");
    }    
    public void closeBrowser () {
        System.out.println("Closed Browser");
    }
    public void newTab () {
        System.out.println("New Tab");
    }
    public void refreshPage(){
        System.out.println("Page Updated");
    }
}
