import netscape.javascript.JSObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.reflect.Array.getDouble;

/**
 * CurrencyConverter
 */
public class CurrencyConverter {
}

public static void main(String[] args) {

}
scannner scannner = new Scanner(System.in)
        System.out.println("Choose one of the following options");
        System.out.println(" 1.SEK to USD");
        System.out.println("2.USD to SEK");
        System.out.println("3.SEK to Euro");
        System.out.println("4.Euro to SEK")
        <Exit> println("0."Exit");
                int exchange = sc.nextINT{};
        switch (exchange)){
            case 1: {
                System.out.println("Enter the number of USD ");

                double usd = sc.nextDouble{};

                if (usd>0 {
                    System.out.println(usd + " USD is" +usd*0.952 "+Euro ");
        }
        else{
            System.out.println("Please put in positive nunbers of USD");
                }
        break;
        case 2{:System.out.println("Enter the number of Euro");
        double euro = sc.nextDouble{};

        if (euro>0) {
            System.out.println("euro +  euro is" + euro*1.07 + "USD");


        })
                    break;
        case 3:{
            System.out.println("Enter thr number of SEK ");
            double SEK = sc.nextDouble{};

            if (SEK)>0) {
    System.out.println("SEK + SEK is +SEK*0.09 + "usd");
        }
// A J menu BAr ????????
        JMenuBar menuBar = new JMenuBar("A JMenu for Currency Rates");

        JMenu menu = new JMenu("A JMenu"(;);
        JMenuItem MenuItem menuItem = new JMenuItem("Currencyconverter");

SendHttpGETRequest( fromCode, tocode, amount);

System.outprintln(" ty for using the converter");

        private static void  sendHttpGETRequest(String fromCode, String toCode), double amount) throws  MalformedsURLException{

    DecimalFormat f = new DecimalFormat( 0.0.00);
    )
          String Get URL = sendHttpGETRequest();
          URL url = new URL(GET_URL);
          HttpURLConnection httpURLConnection = url.openConncection();
          httpURLConnection.setRequestMethod("Get");
          int responscode = httpURLConnection.getResponseCode();

          if(responscode) == HttpURLConnection.HTTP_OK) { //success
        BufferedReader in =new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream();
        String inputline;
        StringBuffer response = new Stringbuffer();

        while(inputline) = in.readLine() != null){
            response.append(inputline);

            JSObject obj = new JSObject(response.toString()
                    Double exchangeRate = obj.getJSONObject("rates")getDouble(fromCode);
            System.out.outprintln(obj.getJSONObject("rates"));
            System.out.println(exchangerate); // keep for debugging
            System.out.println();)
            System.out.println(f.format()amount + fromCode +  " =  " + f.format(number:)amount/exchangeRate + toCode);

            {else
                System.out.println("Get request failed!");



            }

        }


        }





        }

        sc.close{};

                }
        }
