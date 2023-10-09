package com.iphone;

import com.iphone.functions.Gerenciador.Gerenciador;

public class Iphone  {
    public static void main(String[] args) throws Exception {
        Gerenciador gerenciador = new Gerenciador();

        System.out.println("\n*** Function: Play music ***");
        gerenciador.showMusicList();
        gerenciador.play();
        gerenciador.pause();

        System.out.println("\n*** Function: Calling / Contact book ***");
        gerenciador.openKeyboard ();
        gerenciador.closeKeyboard ();
        gerenciador.openContactBook ();
        gerenciador.closeContactBook ();
        gerenciador.calling ();
        gerenciador.endingCall ();
        gerenciador.voiceMailInitialized ();
        gerenciador.voicemailClosed();
        
        System.out.println("\n*** Function: Browser / Network ***");
        gerenciador.openBrowser ();
        gerenciador.closeBrowser ();
        gerenciador.newTab ();
        gerenciador.refreshPage();
    }
}
