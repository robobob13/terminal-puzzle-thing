import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Scanner;

class powerTakeAway{
    static void typewrite(String name, int sec, int linsec){
            int i;
            int j;
            String[] nameray = name.split("\\n",0);
            for(j=0; j<nameray.length;j++){
                for(i=0; i<nameray[j].length();i++){
                    System.out.printf("%c", nameray[j].charAt(i));
                    try{
                        Thread.sleep(sec); 
                    } catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    
                    }
                }
                System.out.printf("\n");
                try{
                    Thread.sleep(linsec); 
                } catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                
                }
            }   
            
        }
    public static void main(String[] args) {
        String[] anslist = {"MTM=", "TklFVFpTQ0hF","Qk9NQkU=", "R09EIElTIERFQUQuIEdPRCBSRU1BSU5TIERFQUQuIEFORCBXRSBIQVZFIEtJTExFRCBISU0uIEhPVyBTSEFMTCBXRSBDT01GT1JUIE9VUlNFTFZFUywgVEhFIE1VUkRFUkVSUyBPRiBBTEwgTVVSREVSRVJTPyA=", "R09EIElTIERFQUQuIEdPRCBSRU1BSU5TIERFQUQuIEFORCBXRSBIQVZFIEtJTExFRCBISU0uIEhPVyBTSEFMTCBXRSBDT01GT1JUIE9VUlNFTFZFUywgVEhFIE1VUkRFUkVSUyBPRiBBTEwgTVVSREVSRVJTPw=="};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Try programiz.pro");
        String inp = keyboard.nextLine();
        Boolean tinp = inp.toUpperCase().contains("disagree".toUpperCase()) || inp.toUpperCase().contains("no".toUpperCase());
        if (tinp==true) {
            System.out.println("Noooo my power");
            String inp0 = keyboard.nextLine();
            if(inp0.equals("")){
                try{
                   Thread.sleep(1000); 
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                
                }
                String outt = "You have won.\nNow what will you do?\nWhat is your next target?\nNo one stands in your way.";
                typewrite(outt, 75, 300);
                String strtmsg = "\nYour move now, [Insert Name Here]";
                typewrite(strtmsg, 75, 600);
                keyboard.nextLine();
                typewrite("\nActually I don't care. \nI really hope you didn't think it's over.\nDon't worry, you won't need to-\nTbq Vf Qrnq. Tbq Erznvaf Qrnq.\n-Goddamn ceaser messing with my-\nSld wrw gsv Mzarh hfuuvi fmwvi Gfirmt'h ivrtm? Sld wrw gsrh lmv nzm ivzw Srgovi'h nrmw?\n-And now Ngonfu is having a fun time as well.\nI know you won't be able to do much at all, and you will suffer.\nSuffer for not trying programiz.pro\nHAHAHAAHHAHAHAHAHAHAH\nAnyway go in order if you have to.\nIf you must, figure out ceaser's number", 50, 300);
                String inp1 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp1.contains(anslist[0])){
                    inp1 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                }
                typewrite("HOW DID YOU\nNever mind that, you surely won't figure out the man behind the slaughter.", 60, 350);
                String inp2 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp2.contains(anslist[1])){
                    inp2 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                }
                typewrite("Tricky one, aren't you?\nI will trust in my final defense however.\nGood luck.", 60, 350);
                String inp3 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                while(!inp3.contains(anslist[2])){
                    inp3 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                }
                typewrite("You monster.\nYou beat my code, sure, buy you can't beat my speed.\nIf you need to know what to type, refer back to what the slaughtering man refered to. It ends with the first question he asks.\nYour time starts..\nNow", 60, 350);
                int len;
                while (true) {
                    Instant start = Instant.now();
                    String inp4 = Base64.getEncoder().encodeToString(keyboard.nextLine().toUpperCase().getBytes());
                    if((inp4.equals(anslist[3])) || ((inp4.equals(anslist[4])))){
                        Instant end = Instant.now();
                        len = inp4.length();
                        System.out.println(Duration.between(start, end));
                        break;
                    }
                    else{
                        System.out.println("Try again. Bit slow, are you not? Press enter before continuing.");
                        keyboard.nextLine();
                    
                    }
                }}    
                
                          
            }
        }
    }