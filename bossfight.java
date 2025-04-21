// Made by robobob13 on github. 

import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;


/*import java.io.File; 
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;*/


// import javax.swing.plaf.basic.BasicSplitPaneUI;


class powerTakeAway{
    static void typewrite(String name, int sec, int linsec){
            int i;
            int j;
            String[] nameray = name.split("\\n",0);
            for(j=0; j<nameray.length;j++){
                for(i=0; i<nameray[j].length();i++  ){
                    System.out.printf("%c", nameray[j].charAt(i));
                    delay(sec);
                    if((nameray[j].charAt(i)=='.') && (nameray[j].charAt(((i+1)%nameray.length))==' ')){
                        delay(30);
                    }
                    if(nameray[j].charAt(i)==','){
                        delay(15);
                    }
                    if(nameray[j].charAt(i)==';'){
                        delay(25);
                    }
                }
                System.out.printf("\n");
                delay(linsec);
            }   
            
        }
    static void delay(int milsec){
        try{
                   Thread.sleep(milsec); 
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                
                }
    }
    public static void main(String[] args) {
        String[] anslist = {"MTM=", "TklFVFpTQ0hF","Qk9NQkU=", "S1JZUFRPUw==", "T1BQRU5IRUlNRVI=", "SSBBTSBBVE9NSUM=","R09EIElTIERFQUQuIEdPRCBSRU1BSU5TIERFQUQuIEFORCBXRSBIQVZFIEtJTExFRCBISU0uIEhPVyBTSEFMTCBXRSBDT01GT1JUIE9VUlNFTFZFUywgVEhFIE1VUkRFUkVSUyBPRiBBTEwgTVVSREVSRVJTPyA=", "R09EIElTIERFQUQuIEdPRCBSRU1BSU5TIERFQUQuIEFORCBXRSBIQVZFIEtJTExFRCBISU0uIEhPVyBTSEFMTCBXRSBDT01GT1JUIE9VUlNFTFZFUywgVEhFIE1VUkRFUkVSUyBPRiBBTEwgTVVSREVSRVJTPw=="};
        String[] insults = {"How do you crack my code and not know what to type? Dissapointing.", "What, did you make a spelling mistake? Try again.", "Wrong! How many times are we going to keep doing this?", "Its not that difficult to search it up if you don't know anything.", "So close, yet so far. Nah jk you weren't even close to fast enough.", "Bit slow aren't you? Bit is an understatement.", "OOH ALMOST THERE!! Thats a joke. Im joking. Im now a clown because of you.", "**Can we get much faster?**, *So fast..* Nah it doesn't seem we can."};
        String[] boll = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don’t count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful", "WW91IGZvb2wu"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Try programiz.pro");
        
        String inp = keyboard.nextLine();
        Random random = new Random();
        Boolean tinp = inp.toUpperCase().contains("disagree".toUpperCase()) || inp.toUpperCase().contains("no".toUpperCase());
        if (tinp==true) {
            System.out.println("Noooo my power");
            String inp0 = keyboard.nextLine();
            String name = keyboard.nextLine();
            if(inp0.equals("")){
                delay(1000);
                String outt = "You have won.\nNow what will you do?\nWhat is your next target?\nNo one stands in your way.";
                typewrite(outt, 75, 300);
                String strtmsg = "\nYour move now, "+name+".";
                typewrite(strtmsg, 75, 600);
                keyboard.nextLine();
                int ballin = boll.length;
                typewrite("Actually nevermind. \nI really hope you didn't think it's over.\nDon't worry, you won't need to-\nTbq Vf Qrnq. Tbq Erznvaf Qrnq.\n-Goddamn ceaser messing with my-\nSld wrw gsv Mzarh hfuuvi fmwvi Gfirmt'h ivrtm? Sld wrw gsrh lmv nzm ivzw Srgovi'h nrmw?\n-And now Ngonfu is having a fun time as well.\nI know you won't be able to do much at all, and you will suffer.\nSuffer for not trying programiz.pro\nHAHAHAAHHAHAHAHAHAHAH\nQrn Hzmylim\nXfu X aono scrhaw nvyia, hzo uchmfgivp dy kgbcbh.\nVr sqf nallw pg fny dhxqkyk vbu mehjd vqp gncsabb.\nDamn this channel is insecure. Anyway go in order if you have to.\nIf you must, figure out ceaser's number", 50, 200);
                String inp1 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp1.contains(anslist[0])){
                    inp1 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp1.contains(anslist[0])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }
                typewrite("HOW DID YOU\nRight you can access the internet. Never mind that, you surely won't figure out the man behind the slaughter.", 60, 350);
                String inp2 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp2.contains(anslist[1])){
                    inp2 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp2.contains(anslist[1])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }
                typewrite("Tricky one, aren't you?\nLet's see if you are better than the ENIGMAtic man himself.", 60, 350);
                String inp3 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp3.contains(anslist[2])){
                    inp3 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp3.contains(anslist[2])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }
                typewrite("I'm gonna have to fire my cryptographer.\nHe didn't do as well of a job here as he did at the Climate Interested Americans.", 60, 350);
                String inp4 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp4.contains(anslist[3])){
                    inp4 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp4.contains(anslist[3])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }
                typewrite("OH GOD YOU'RE CLOSE.\nListen, "+name+". Don't finish it. You'll regret it more than the man himself. ", 60, 350);
                String inp5 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp5.contains(anslist[4])){
                    inp5 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp5.contains(anslist[4])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }
                typewrite("OH SCHIZE THERE'S ONLY 1 LEFT.\nYou did this to yourself "+name+". Playtime's over. Ill simply have to become nuclear myself.",60,350);
                String inp6 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp6.contains(anslist[5])){
                    inp6 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if(!inp6.contains(anslist[5])){
                        System.out.println(boll[random.nextInt(ballin)]);
                    }
                }

                typewrite("You monster.\nYou didn't have to do this.\nI need to throw my final defense at you.\nLet's see if you're as fast as you are smart.\nAbout 80 should do it, don't you think?\nIf you need to know what to type, refer back to what the slaughtering man refered to. The Madman. The Madman from Wikipedia.     It ends with the first question he asks.\nYour time starts..\nNow\nJust press enter before you start typing. No cheating!", 60, 350);
                keyboard.nextLine();
                int attempt = 0;
                while (true) {
                    attempt+=1;
                    Instant start = Instant.now();
                    String inp7 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    
                    if((inp7.equals(anslist[anslist.length-1])) || ((inp7.equals(anslist[anslist.length-2])))){
                        Instant end = Instant.now();
                        long dur = Duration.between(start, end).toSeconds();
                        //System.out.println("Dur: "+dur);
                        double durr = Math.toIntExact(dur);
                        //System.out.println("Durr: "+durr);
                        double findur = durr/60;
                        double wpm = 21/findur; // Problem here
                        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at powerTakeAway.main(bossfight.java:84)*/
                        //Problem fixed BY taking double instead of int values on each thing, much better and gives proper output. 
                        if(wpm>=80){
                            if(wpm>=300){
                                typewrite("No no, no copy pasting! With your "+wpm+ " wpm. You aren't a god, I am well aware. Type it properly this time. Press enter before continuing.", 50, 100);
                                keyboard.nextLine();
                            }
                            else{
                                typewrite("No you didn't, "+name+".\nYou did not just type at "+wpm+" WPM.\nAnd it took you " +attempt+" attempts..? I gave you so many chances, and you squander them all!?\nThis is how you repay my hospitality?\nThis is how you treat my completely processable and-not-at-all-inconsistency-ridden game?\nNo choice you leave me, do you?\nYou are going to be having a very bad time.\n", 60, 350);
                            break;
                            }
                            
                        }
                        else{
                            System.out.println(wpm+" WPM.");
                            System.out.println(insults[random.nextInt(4)+4]+" Press enter before continuing.");
                            keyboard.nextLine();
                            
                        }
                    }
                    else{
                        System.out.println(insults[random.nextInt(4)]+" Press enter before continuing.");
                        keyboard.nextLine();
                    
                    }
                }
                // Start here
                typewrite("\nOh, you hear that, don't you?\nIt's a beautiful day outside. Flowers are blooming, birds are chirping.\nOn days like these, codebreakers like you...\nSHOULD BE BURNING IN HELL", 50, 300);

                
            
            
            
            }    
                
                          
            }
        }
    }
