package colorpalette.www.mohits_programming.com.colorpalette;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import colorpalette.www.mohits_programming.com.colorpalette.DataClass.DataClass;
import colorpalette.www.mohits_programming.com.colorpalette.JsonParser.JsonParser;

public class ColorsActivity extends AppCompatActivity {


    private android.support.v7.widget.Toolbar toolbar;

    private String GET_DATA;

    private StringBuilder stringBuilder;

    private StringBuilder stringBuildervalues;

    private List<String> listValues;

    private String SPACE_TEXT = "";

    private String NEW_LINE = "\n";

    String colors;
    int a;

    //card view declaring
    private CardView cardView1;
    private TextView ColorName1;
    private TextView ColorValue1;

    private CardView cardView2;
    private TextView ColorName2;
    private TextView ColorValue2;

    private CardView cardView3;
    private TextView ColorName3;
    private TextView ColorValue3;

    private CardView cardView4;
    private TextView ColorName4;
    private TextView ColorValue4;

    private CardView cardView5;
    private TextView ColorName5;
    private TextView ColorValue5;

    private CardView cardView6;
    private TextView ColorName6;
    private TextView ColorValue6;

    private CardView cardView7;
    private TextView ColorName7;
    private TextView ColorValue7;

    private CardView cardView8;
    private TextView ColorName8;
    private TextView ColorValue8;

    private CardView cardView9;
    private TextView ColorName9;
    private TextView ColorValue9;

    private CardView cardView10;
    private TextView ColorName10;
    private TextView ColorValue10;

    private CardView cardView11;
    private TextView ColorName11;
    private TextView ColorValue11;

    private CardView cardView12;
    private TextView ColorName12;
    private TextView ColorValue12;

    private CardView cardView13;
    private TextView ColorName13;
    private TextView ColorValue13;

    private CardView cardView14;
    private TextView ColorName14;
    private TextView ColorValue14;

    private CardView cardView15;
    private TextView ColorName15;
    private TextView ColorValue15;

    private CardView cardView16;
    private TextView ColorName16;
    private TextView ColorValue16;

    private CardView cardView17;
    private TextView ColorName17;
    private TextView ColorValue17;


    private CardView cardView18;
    private TextView ColorName18;
    private TextView ColorValue18;


    private CardView cardView19;
    private TextView ColorName19;
    private TextView ColorValue19;


    private CardView cardView20;
    private TextView ColorName20;
    private TextView ColorValue20;


    private CardView cardView21;
    private TextView ColorName21;
    private TextView ColorValue21;


    private CardView cardView22;
    private TextView ColorName22;
    private TextView ColorValue22;


    private CardView cardView23;
    private TextView ColorName23;
    private TextView ColorValue23;

    private CardView cardView24;
    private TextView ColorName24;
    private TextView ColorValue24;


    private CardView cardView25;
    private TextView ColorName25;
    private TextView ColorValue25;


    private CardView cardView26;
    private TextView ColorName26;
    private TextView ColorValue26;


    private CardView cardView27;
    private TextView ColorName27;
    private TextView ColorValue27;


    private CardView cardView28;
    private TextView ColorName28;
    private TextView ColorValue28;


    private CardView cardView29;
    private TextView ColorName29;
    private TextView ColorValue29;


    private CardView cardView30;
    private TextView ColorName30;
    private TextView ColorValue30;


    private CardView cardView31;
    private TextView ColorName31;
    private TextView ColorValue31;


    private CardView cardView32;
    private TextView ColorName32;
    private TextView ColorValue32;


    private CardView cardView33;
    private TextView ColorName33;
    private TextView ColorValue33;


    private CardView cardView34;
    private TextView ColorName34;
    private TextView ColorValue34;


    private CardView cardView35;
    private TextView ColorName35;
    private TextView ColorValue35;


    private CardView cardView36;
    private TextView ColorName36;
    private TextView ColorValue36;


    private CardView cardView37;
    private TextView ColorName37;
    private TextView ColorValue37;


    private CardView cardView38;
    private TextView ColorName38;
    private TextView ColorValue38;


    private CardView cardView39;
    private TextView ColorName39;
    private TextView ColorValue39;

    private CardView cardView40;
    private TextView ColorName40;
    private TextView ColorValue40;

    private CardView cardView41;
    private TextView ColorName41;
    private TextView ColorValue41;

    private CardView cardView42;
    private TextView ColorName42;
    private TextView ColorValue42;

    private CardView cardView43;
    private TextView ColorName43;
    private TextView ColorValue43;

    private CardView cardView44;
    private TextView ColorName44;
    private TextView ColorValue44;

    private CardView cardView45;
    private TextView ColorName45;
    private TextView ColorValue45;

    private CardView cardView46;
    private TextView ColorName46;
    private TextView ColorValue46;

    private CardView cardView47;
    private TextView ColorName47;
    private TextView ColorValue47;

    private CardView cardView48;
    private TextView ColorName48;
    private TextView ColorValue48;


    private CardView cardView49;
    private TextView ColorName49;
    private TextView ColorValue49;

    private CardView cardView50;
    private TextView ColorName50;
    private TextView ColorValue50;

    private CardView cardView51;
    private TextView ColorName51;
    private TextView ColorValue51;

    private CardView cardView52;
    private TextView ColorName52;
    private TextView ColorValue52;

    private CardView cardView53;
    private TextView ColorName53;
    private TextView ColorValue53;

    private CardView cardView54;
    private TextView ColorName54;
    private TextView ColorValue54;

    private CardView cardView55;
    private TextView ColorName55;
    private TextView ColorValue55;

    private CardView cardView56;
    private TextView ColorName56;
    private TextView ColorValue56;

    private CardView cardView57;
    private TextView ColorName57;
    private TextView ColorValue57;

    private CardView cardView58;
    private TextView ColorName58;
    private TextView ColorValue58;

    private CardView cardView59;
    private TextView ColorName59;
    private TextView ColorValue59;

    private CardView cardView60;
    private TextView ColorName60;
    private TextView ColorValue60;


    private CardView cardView61;
    private TextView ColorName61;
    private TextView ColorValue61;


    private CardView cardView62;
    private TextView ColorName62;
    private TextView ColorValue62;


    private CardView cardView63;
    private TextView ColorName63;
    private TextView ColorValue63;


    private CardView cardView64;
    private TextView ColorName64;
    private TextView ColorValue64;


    private CardView cardView65;
    private TextView ColorName65;
    private TextView ColorValue65;


    private CardView cardView66;
    private TextView ColorName66;
    private TextView ColorValue66;


    private CardView cardView67;
    private TextView ColorName67;
    private TextView ColorValue67;


    private CardView cardView68;
    private TextView ColorName68;
    private TextView ColorValue68;


    private CardView cardView69;
    private TextView ColorName69;
    private TextView ColorValue69;


    private CardView cardView70;
    private TextView ColorName70;
    private TextView ColorValue70;


    private CardView cardView71;
    private TextView ColorName71;
    private TextView ColorValue71;


    private CardView cardView72;
    private TextView ColorName72;
    private TextView ColorValue72;


    private CardView cardView73;
    private TextView ColorName73;
    private TextView ColorValue73;


    private CardView cardView74;
    private TextView ColorName74;
    private TextView ColorValue74;


    private CardView cardView75;
    private TextView ColorName75;
    private TextView ColorValue75;


    private CardView cardView76;
    private TextView ColorName76;
    private TextView ColorValue76;


    private CardView cardView77;
    private TextView ColorName77;
    private TextView ColorValue77;


    private CardView cardView78;
    private TextView ColorName78;
    private TextView ColorValue78;


    private CardView cardView79;
    private TextView ColorName79;
    private TextView ColorValue79;


    private CardView cardView80;
    private TextView ColorName80;
    private TextView ColorValue80;


    private CardView cardView81;
    private TextView ColorName81;
    private TextView ColorValue81;


    private CardView cardView82;
    private TextView ColorName82;
    private TextView ColorValue82;


    private CardView cardView83;
    private TextView ColorName83;
    private TextView ColorValue83;


    private CardView cardView84;
    private TextView ColorName84;
    private TextView ColorValue84;


    private CardView cardView85;
    private TextView ColorName85;
    private TextView ColorValue85;


    private CardView cardView86;
    private TextView ColorName86;
    private TextView ColorValue86;

    private CardView cardView87;
    private TextView ColorName87;
    private TextView ColorValue87;

    private CardView cardView88;
    private TextView ColorName88;
    private TextView ColorValue88;

    private CardView cardView89;
    private TextView ColorName89;
    private TextView ColorValue89;

    private CardView cardView90;
    private TextView ColorName90;
    private TextView ColorValue90;

    private CardView cardView91;
    private TextView ColorName91;
    private TextView ColorValue91;

    private CardView cardView92;
    private TextView ColorName92;
    private TextView ColorValue92;

    private CardView cardView93;
    private TextView ColorName93;
    private TextView ColorValue93;

    private CardView cardView94;
    private TextView ColorName94;
    private TextView ColorValue94;

    private CardView cardView95;
    private TextView ColorName95;
    private TextView ColorValue95;

    private CardView cardView96;
    private TextView ColorName96;
    private TextView ColorValue96;

    private CardView cardView97;
    private TextView ColorName97;
    private TextView ColorValue97;

    private CardView cardView98;
    private TextView ColorName98;
    private TextView ColorValue98;

    private CardView cardView99;
    private TextView ColorName99;
    private TextView ColorValue99;

    private CardView cardView100;
    private TextView ColorName100;
    private TextView ColorValue100;


    private CardView cardView101;
    private TextView ColorName101;
    private TextView ColorValue101;

    private CardView cardView102;
    private TextView ColorName102;
    private TextView ColorValue102;

    private CardView cardView103;
    private TextView ColorName103;
    private TextView ColorValue103;

    private CardView cardView104;
    private TextView ColorName104;
    private TextView ColorValue104;

    private CardView cardView105;
    private TextView ColorName105;
    private TextView ColorValue105;

    private CardView cardView106;
    private TextView ColorName106;
    private TextView ColorValue106;

    private CardView cardView107;
    private TextView ColorName107;
    private TextView ColorValue107;

    private CardView cardView108;
    private TextView ColorName108;
    private TextView ColorValue108;

    private CardView cardView109;
    private TextView ColorName109;
    private TextView ColorValue109;

    private CardView cardView110;
    private TextView ColorName110;
    private TextView ColorValue110;


    private CardView cardView111;
    private TextView ColorName111;
    private TextView ColorValue111;


    private CardView cardView112;
    private TextView ColorName112;
    private TextView ColorValue112;

    private CardView cardView113;
    private TextView ColorName113;
    private TextView ColorValue113;


    private CardView cardView114;
    private TextView ColorName114;
    private TextView ColorValue114;


    private CardView cardView115;
    private TextView ColorName115;
    private TextView ColorValue115;


    private CardView cardView116;
    private TextView ColorName116;
    private TextView ColorValue116;


    private CardView cardView117;
    private TextView ColorName117;
    private TextView ColorValue117;

    private CardView cardView118;
    private TextView ColorName118;
    private TextView ColorValue118;

    private CardView cardView119;
    private TextView ColorName119;
    private TextView ColorValue119;


    private CardView cardView120;
    private TextView ColorName120;
    private TextView ColorValue120;


    private CardView cardView121;
    private TextView ColorName121;
    private TextView ColorValue121;


    private CardView cardView122;
    private TextView ColorName122;
    private TextView ColorValue122;


    private CardView cardView123;
    private TextView ColorName123;
    private TextView ColorValue123;


    private CardView cardView124;
    private TextView ColorName124;
    private TextView ColorValue124;


    private CardView cardView125;
    private TextView ColorName125;
    private TextView ColorValue125;


    private CardView cardView126;
    private TextView ColorName126;
    private TextView ColorValue126;


    private CardView cardView127;
    private TextView ColorName127;
    private TextView ColorValue127;


    private CardView cardView128;
    private TextView ColorName128;
    private TextView ColorValue128;


    private CardView cardView129;
    private TextView ColorName129;
    private TextView ColorValue129;


    private CardView cardView130;
    private TextView ColorName130;
    private TextView ColorValue130;


    private CardView cardView131;
    private TextView ColorName131;
    private TextView ColorValue131;


    private CardView cardView132;
    private TextView ColorName132;
    private TextView ColorValue132;


    private CardView cardView133;
    private TextView ColorName133;
    private TextView ColorValue133;


    private CardView cardView134;
    private TextView ColorName134;
    private TextView ColorValue134;


    private CardView cardView135;
    private TextView ColorName135;
    private TextView ColorValue135;


    private CardView cardView136;
    private TextView ColorName136;
    private TextView ColorValue136;


    private CardView cardView137;
    private TextView ColorName137;
    private TextView ColorValue137;



    private CardView cardView138;
    private TextView ColorName138;
    private TextView ColorValue138;


    private CardView cardView139;
    private TextView ColorName139;
    private TextView ColorValue139;


    private CardView cardView140;
    private TextView ColorName140;
    private TextView ColorValue140;


    private CardView cardView141;
    private TextView ColorName141;
    private TextView ColorValue141;


    private CardView cardView142;
    private TextView ColorName142;
    private TextView ColorValue142;


    private CardView cardView143;
    private TextView ColorName143;
    private TextView ColorValue143;


    private CardView cardView144;
    private TextView ColorName144;
    private TextView ColorValue144;

    private CardView cardView145;
    private TextView ColorName145;
    private TextView ColorValue145;

    private CardView cardView146;
    private TextView ColorName146;
    private TextView ColorValue146;

    private CardView cardView147;
    private TextView ColorName147;
    private TextView ColorValue147;

    private CardView cardView148;
    private TextView ColorName148;
    private TextView ColorValue148;


    private Typeface typeface;
    private TextView typefacetext;


    private List<String> list;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.colors_activity);

        toolbar = (android.support.v7.widget.Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);



        cardView1 = (CardView) findViewById (R.id.cardview1);
        ColorName1 = (TextView) findViewById (R.id.ColorName1);
        ColorValue1 = (TextView) findViewById (R.id.ColorValue1);



        cardView2 = (CardView) findViewById (R.id.cardview2);
        ColorName2 = (TextView) findViewById (R.id.ColorName2);
        ColorValue2 = (TextView) findViewById (R.id.ColorValue2);

        cardView3 = (CardView) findViewById (R.id.cardview3);
        ColorName3 = (TextView) findViewById (R.id.ColorName3);
        ColorValue3 = (TextView) findViewById (R.id.ColorValue3);

        cardView4 = (CardView) findViewById (R.id.cardview4);
        ColorName4 = (TextView) findViewById (R.id.ColorName4);
        ColorValue4 = (TextView) findViewById (R.id.ColorValue4);

        cardView5 = (CardView) findViewById (R.id.cardview5);
        ColorName5 = (TextView) findViewById (R.id.ColorName5);
        ColorValue5 = (TextView) findViewById (R.id.ColorValue5);

        cardView6 = (CardView) findViewById (R.id.cardview6);
        ColorName6 = (TextView) findViewById (R.id.ColorName6);
        ColorValue6 = (TextView) findViewById (R.id.ColorValue6);


        cardView7 = (CardView) findViewById (R.id.cardview7);
        ColorName7 = (TextView) findViewById (R.id.ColorName7);
        ColorValue7 = (TextView) findViewById (R.id.ColorValue7);

        cardView8 = (CardView) findViewById (R.id.cardview8);
        ColorName8 = (TextView) findViewById (R.id.ColorName8);
        ColorValue8 = (TextView) findViewById (R.id.ColorValue8);

        cardView9 = (CardView) findViewById (R.id.cardview9);
        ColorName9 = (TextView) findViewById (R.id.ColorName9);
        ColorValue9 = (TextView) findViewById (R.id.ColorValue9);

        cardView10 = (CardView) findViewById (R.id.cardview10);
        ColorName10 = (TextView) findViewById (R.id.ColorName10);
        ColorValue10 = (TextView) findViewById (R.id.ColorValue10);

        cardView11 = (CardView) findViewById (R.id.cardview11);
        ColorName11 = (TextView) findViewById (R.id.ColorName11);
        ColorValue11 = (TextView) findViewById (R.id.ColorValue11);

        cardView12 = (CardView) findViewById (R.id.cardview12);
        ColorName12 = (TextView) findViewById (R.id.ColorName12);
        ColorValue12 = (TextView) findViewById (R.id.ColorValue12);

        cardView13 = (CardView) findViewById (R.id.cardview13);
        ColorName13 = (TextView) findViewById (R.id.ColorName13);
        ColorValue13 = (TextView) findViewById (R.id.ColorValue13);

        cardView14 = (CardView) findViewById (R.id.cardview14);
        ColorName14 = (TextView) findViewById (R.id.ColorName14);
        ColorValue14 = (TextView) findViewById (R.id.ColorValue14);

        cardView15 = (CardView) findViewById (R.id.cardview15);
        ColorName15 = (TextView) findViewById (R.id.ColorName15);
        ColorValue15 = (TextView) findViewById (R.id.ColorValue15);

        cardView16 = (CardView) findViewById (R.id.cardview16);
        ColorName16 = (TextView) findViewById (R.id.ColorName16);
        ColorValue16 = (TextView) findViewById (R.id.ColorValue16);

        cardView17 = (CardView) findViewById (R.id.cardview17);
        ColorName17 = (TextView) findViewById (R.id.ColorName17);
        ColorValue17 = (TextView) findViewById (R.id.ColorValue17);


        cardView18 = (CardView) findViewById (R.id.cardview18);
        ColorName18 = (TextView) findViewById (R.id.ColorName18);
        ColorValue18 = (TextView) findViewById (R.id.ColorValue18);

        cardView19 = (CardView) findViewById (R.id.cardview19);
        ColorName19 = (TextView) findViewById (R.id.ColorName19);
        ColorValue19 = (TextView) findViewById (R.id.ColorValue19);

        cardView20 = (CardView) findViewById (R.id.cardview20);
        ColorName20 = (TextView) findViewById (R.id.ColorName20);
        ColorValue20 = (TextView) findViewById (R.id.ColorValue20);

        cardView21 = (CardView) findViewById (R.id.cardview21);
        ColorName21 = (TextView) findViewById (R.id.ColorName21);
        ColorValue21 = (TextView) findViewById (R.id.ColorValue21);

        cardView22 = (CardView) findViewById (R.id.cardview22);
        ColorName22 = (TextView) findViewById (R.id.ColorName22);
        ColorValue22 = (TextView) findViewById (R.id.ColorValue22);

        cardView23 = (CardView) findViewById (R.id.cardview23);
        ColorName23 = (TextView) findViewById (R.id.ColorName23);
        ColorValue23 = (TextView) findViewById (R.id.ColorValue23);

        cardView24 = (CardView) findViewById (R.id.cardview24);
        ColorName24 = (TextView) findViewById (R.id.ColorName24);
        ColorValue24 = (TextView) findViewById (R.id.ColorValue24);

        cardView25 = (CardView) findViewById (R.id.cardview25);
        ColorName25 = (TextView) findViewById (R.id.ColorName25);
        ColorValue25 = (TextView) findViewById (R.id.ColorValue25);

        cardView26 = (CardView) findViewById (R.id.cardview26);
        ColorName26 = (TextView) findViewById (R.id.ColorName26);
        ColorValue26 = (TextView) findViewById (R.id.ColorValue26);

        cardView27 = (CardView) findViewById (R.id.cardview27);
        ColorName27 = (TextView) findViewById (R.id.ColorName27);
        ColorValue27 = (TextView) findViewById (R.id.ColorValue27);

        cardView28 = (CardView) findViewById (R.id.cardview28);
        ColorName28 = (TextView) findViewById (R.id.ColorName28);
        ColorValue28 = (TextView) findViewById (R.id.ColorValue28);

        cardView29 = (CardView) findViewById (R.id.cardview29);
        ColorName29 = (TextView) findViewById (R.id.ColorName29);
        ColorValue29 = (TextView) findViewById (R.id.ColorValue29);

        cardView30 = (CardView) findViewById (R.id.cardview30);
        ColorName30 = (TextView) findViewById (R.id.ColorName30);
        ColorValue30 = (TextView) findViewById (R.id.ColorValue30);

        cardView31 = (CardView) findViewById (R.id.cardview31);
        ColorName31 = (TextView) findViewById (R.id.ColorName31);
        ColorValue31 = (TextView) findViewById (R.id.ColorValue31);

        cardView32 = (CardView) findViewById (R.id.cardview32);
        ColorName32 = (TextView) findViewById (R.id.ColorName32);
        ColorValue32 = (TextView) findViewById (R.id.ColorValue32);

        cardView33 = (CardView) findViewById (R.id.cardview33);
        ColorName33 = (TextView) findViewById (R.id.ColorName33);
        ColorValue33 = (TextView) findViewById (R.id.ColorValue33);

        cardView34 = (CardView) findViewById (R.id.cardview34);
        ColorName34 = (TextView) findViewById (R.id.ColorName34);
        ColorValue34 = (TextView) findViewById (R.id.ColorValue34);

        cardView35 = (CardView) findViewById (R.id.cardview35);
        ColorName35 = (TextView) findViewById (R.id.ColorName35);
        ColorValue35 = (TextView) findViewById (R.id.ColorValue35);

        cardView36 = (CardView) findViewById (R.id.cardview36);
        ColorName36 = (TextView) findViewById (R.id.ColorName36);
        ColorValue36 = (TextView) findViewById (R.id.ColorValue36);

        cardView37 = (CardView) findViewById (R.id.cardview37);
        ColorName37 = (TextView) findViewById (R.id.ColorName37);
        ColorValue37 = (TextView) findViewById (R.id.ColorValue37);


        cardView38 = (CardView) findViewById (R.id.cardview38);
        ColorName38 = (TextView) findViewById (R.id.ColorName38);
        ColorValue38 = (TextView) findViewById (R.id.ColorValue38);


        cardView39 = (CardView) findViewById (R.id.cardview39);
        ColorName39 = (TextView) findViewById (R.id.ColorName39);
        ColorValue39 = (TextView) findViewById (R.id.ColorValue39);


        cardView40 = (CardView) findViewById (R.id.cardview40);
        ColorName40 = (TextView) findViewById (R.id.ColorName40);
        ColorValue40 = (TextView) findViewById (R.id.ColorValue40);

        cardView41 = (CardView) findViewById (R.id.cardview41);
        ColorName41 = (TextView) findViewById (R.id.ColorName41);
        ColorValue41 = (TextView) findViewById (R.id.ColorValue41);

        cardView42 = (CardView) findViewById (R.id.cardview42);
        ColorName42 = (TextView) findViewById (R.id.ColorName42);
        ColorValue42 = (TextView) findViewById (R.id.ColorValue42);

        cardView43 = (CardView) findViewById (R.id.cardview43);
        ColorName43 = (TextView) findViewById (R.id.ColorName43);
        ColorValue43 = (TextView) findViewById (R.id.ColorValue43);

        cardView44 = (CardView) findViewById (R.id.cardview44);
        ColorName44 = (TextView) findViewById (R.id.ColorName44);
        ColorValue44 = (TextView) findViewById (R.id.ColorValue44);

        cardView45 = (CardView) findViewById (R.id.cardview45);
        ColorName45 = (TextView) findViewById (R.id.ColorName45);
        ColorValue45 = (TextView) findViewById (R.id.ColorValue45);

        cardView46 = (CardView) findViewById (R.id.cardview46);
        ColorName46 = (TextView) findViewById (R.id.ColorName46);
        ColorValue46 = (TextView) findViewById (R.id.ColorValue46);

        cardView47 = (CardView) findViewById (R.id.cardview47);
        ColorName47 = (TextView) findViewById (R.id.ColorName47);
        ColorValue47 = (TextView) findViewById (R.id.ColorValue47);

        cardView48 = (CardView) findViewById (R.id.cardview48);
        ColorName48 = (TextView) findViewById (R.id.ColorName48);
        ColorValue48 = (TextView) findViewById (R.id.ColorValue48);

        cardView49 = (CardView) findViewById (R.id.cardview49);
        ColorName49 = (TextView) findViewById (R.id.ColorName49);
        ColorValue49 = (TextView) findViewById (R.id.ColorValue49);


        cardView50 = (CardView) findViewById (R.id.cardview50);
        ColorName50 = (TextView) findViewById (R.id.ColorName50);
        ColorValue50 = (TextView) findViewById (R.id.ColorValue50);

        cardView51 = (CardView) findViewById (R.id.cardview51);
        ColorName51 = (TextView) findViewById (R.id.ColorName51);
        ColorValue51 = (TextView) findViewById (R.id.ColorValue51);

        cardView52 = (CardView) findViewById (R.id.cardview52);
        ColorName52 = (TextView) findViewById (R.id.ColorName52);
        ColorValue52 = (TextView) findViewById (R.id.ColorValue52);

        cardView53 = (CardView) findViewById (R.id.cardview53);
        ColorName53 = (TextView) findViewById (R.id.ColorName53);
        ColorValue53 = (TextView) findViewById (R.id.ColorValue53);

        cardView54 = (CardView) findViewById (R.id.cardview54);
        ColorName54 = (TextView) findViewById (R.id.ColorName54);
        ColorValue54 = (TextView) findViewById (R.id.ColorValue54);

        cardView55 = (CardView) findViewById (R.id.cardview55);
        ColorName55 = (TextView) findViewById (R.id.ColorName55);
        ColorValue55 = (TextView) findViewById (R.id.ColorValue55);

        cardView56 = (CardView) findViewById (R.id.cardview56);
        ColorName56 = (TextView) findViewById (R.id.ColorName56);
        ColorValue56 = (TextView) findViewById (R.id.ColorValue56);

        cardView57 = (CardView) findViewById (R.id.cardview57);
        ColorName57 = (TextView) findViewById (R.id.ColorName57);
        ColorValue57 = (TextView) findViewById (R.id.ColorValue57);

        cardView58 = (CardView) findViewById (R.id.cardview58);
        ColorName58 = (TextView) findViewById (R.id.ColorName58);
        ColorValue58 = (TextView) findViewById (R.id.ColorValue58);

        cardView59 = (CardView) findViewById (R.id.cardview59);
        ColorName59 = (TextView) findViewById (R.id.ColorName59);
        ColorValue59 = (TextView) findViewById (R.id.ColorValue59);

        cardView60 = (CardView) findViewById (R.id.cardview60);
        ColorName60 = (TextView) findViewById (R.id.ColorName60);
        ColorValue60 = (TextView) findViewById (R.id.ColorValue60);


        cardView61 = (CardView) findViewById (R.id.cardview61);
        ColorName61 = (TextView) findViewById (R.id.ColorName61);
        ColorValue61 = (TextView) findViewById (R.id.ColorValue61);


        cardView62 = (CardView) findViewById (R.id.cardview62);
        ColorName62 = (TextView) findViewById (R.id.ColorName62);
        ColorValue62 = (TextView) findViewById (R.id.ColorValue62);

        cardView63 = (CardView) findViewById (R.id.cardview63);
        ColorName63 = (TextView) findViewById (R.id.ColorName63);
        ColorValue63 = (TextView) findViewById (R.id.ColorValue63);

        cardView64 = (CardView) findViewById (R.id.cardview64);
        ColorName64 = (TextView) findViewById (R.id.ColorName64);
        ColorValue64 = (TextView) findViewById (R.id.ColorValue64);

        cardView65 = (CardView) findViewById (R.id.cardview65);
        ColorName65 = (TextView) findViewById (R.id.ColorName65);
        ColorValue65 = (TextView) findViewById (R.id.ColorValue65);

        cardView66 = (CardView) findViewById (R.id.cardview66);
        ColorName66 = (TextView) findViewById (R.id.ColorName66);
        ColorValue66 = (TextView) findViewById (R.id.ColorValue66);

        cardView67 = (CardView) findViewById (R.id.cardview67);
        ColorName67 = (TextView) findViewById (R.id.ColorName67);
        ColorValue67 = (TextView) findViewById (R.id.ColorValue67);

        cardView68 = (CardView) findViewById (R.id.cardview68);
        ColorName68 = (TextView) findViewById (R.id.ColorName68);
        ColorValue68 = (TextView) findViewById (R.id.ColorValue68);

        cardView69 = (CardView) findViewById (R.id.cardview69);
        ColorName69 = (TextView) findViewById (R.id.ColorName69);
        ColorValue69 = (TextView) findViewById (R.id.ColorValue69);

        cardView70 = (CardView) findViewById (R.id.cardview70);
        ColorName70 = (TextView) findViewById (R.id.ColorName70);
        ColorValue70 = (TextView) findViewById (R.id.ColorValue70);

        cardView71 = (CardView) findViewById (R.id.cardview71);
        ColorName71 = (TextView) findViewById (R.id.ColorName71);
        ColorValue71 = (TextView) findViewById (R.id.ColorValue71);

        cardView72 = (CardView) findViewById (R.id.cardview72);
        ColorName72 = (TextView) findViewById (R.id.ColorName72);
        ColorValue72 = (TextView) findViewById (R.id.ColorValue72);

        cardView73 = (CardView) findViewById (R.id.cardview73);
        ColorName73 = (TextView) findViewById (R.id.ColorName73);
        ColorValue73 = (TextView) findViewById (R.id.ColorValue73);

        cardView74 = (CardView) findViewById (R.id.cardview74);
        ColorName74 = (TextView) findViewById (R.id.ColorName74);
        ColorValue74 = (TextView) findViewById (R.id.ColorValue74);

        cardView75 = (CardView) findViewById (R.id.cardview75);
        ColorName75 = (TextView) findViewById (R.id.ColorName75);
        ColorValue75 = (TextView) findViewById (R.id.ColorValue75);

        cardView76 = (CardView) findViewById (R.id.cardview76);
        ColorName76 = (TextView) findViewById (R.id.ColorName76);
        ColorValue76 = (TextView) findViewById (R.id.ColorValue76);

        cardView77 = (CardView) findViewById (R.id.cardview77);
        ColorName77 = (TextView) findViewById (R.id.ColorName77);
        ColorValue77 = (TextView) findViewById (R.id.ColorValue77);

        cardView78 = (CardView) findViewById (R.id.cardview78);
        ColorName78 = (TextView) findViewById (R.id.ColorName78);
        ColorValue78 = (TextView) findViewById (R.id.ColorValue78);

        cardView79 = (CardView) findViewById (R.id.cardview79);
        ColorName79 = (TextView) findViewById (R.id.ColorName79);
        ColorValue79 = (TextView) findViewById (R.id.ColorValue79);

        cardView80 = (CardView) findViewById (R.id.cardview80);
        ColorName80 = (TextView) findViewById (R.id.ColorName80);
        ColorValue80 = (TextView) findViewById (R.id.ColorValue80);


        cardView81 = (CardView) findViewById (R.id.cardview81);
        ColorName81 = (TextView) findViewById (R.id.ColorName81);
        ColorValue81 = (TextView) findViewById (R.id.ColorValue81);


        cardView82 = (CardView) findViewById (R.id.cardview82);
        ColorName82 = (TextView) findViewById (R.id.ColorName82);
        ColorValue82 = (TextView) findViewById (R.id.ColorValue82);

        cardView83 = (CardView) findViewById (R.id.cardview83);
        ColorName83 = (TextView) findViewById (R.id.ColorName83);
        ColorValue83 = (TextView) findViewById (R.id.ColorValue83);

        cardView84 = (CardView) findViewById (R.id.cardview84);
        ColorName84 = (TextView) findViewById (R.id.ColorName84);
        ColorValue84 = (TextView) findViewById (R.id.ColorValue84);

        cardView85 = (CardView) findViewById (R.id.cardview85);
        ColorName85 = (TextView) findViewById (R.id.ColorName85);
        ColorValue85 = (TextView) findViewById (R.id.ColorValue85);

        cardView86 = (CardView) findViewById (R.id.cardview86);
        ColorName86 = (TextView) findViewById (R.id.ColorName86);
        ColorValue86 = (TextView) findViewById (R.id.ColorValue86);

        cardView87 = (CardView) findViewById (R.id.cardview87);
        ColorName87 = (TextView) findViewById (R.id.ColorName87);
        ColorValue87 = (TextView) findViewById (R.id.ColorValue87);

        cardView88 = (CardView) findViewById (R.id.cardview88);
        ColorName88 = (TextView) findViewById (R.id.ColorName88);
        ColorValue88 = (TextView) findViewById (R.id.ColorValue88);


        cardView89 = (CardView) findViewById (R.id.cardview89);
        ColorName89 = (TextView) findViewById (R.id.ColorName89);
        ColorValue89 = (TextView) findViewById (R.id.ColorValue89);

        cardView90 = (CardView) findViewById (R.id.cardview90);
        ColorName90 = (TextView) findViewById (R.id.ColorName90);
        ColorValue90 = (TextView) findViewById (R.id.ColorValue90);


        cardView91 = (CardView) findViewById (R.id.cardview91);
        ColorName91 = (TextView) findViewById (R.id.ColorName91);
        ColorValue91 = (TextView) findViewById (R.id.ColorValue91);


        cardView92 = (CardView) findViewById (R.id.cardview92);
        ColorName92 = (TextView) findViewById (R.id.ColorName92);
        ColorValue92 = (TextView) findViewById (R.id.ColorValue92);


        cardView93 = (CardView) findViewById (R.id.cardview93);
        ColorName93 = (TextView) findViewById (R.id.ColorName93);
        ColorValue93 = (TextView) findViewById (R.id.ColorValue93);


        cardView94 = (CardView) findViewById (R.id.cardview94);
        ColorName94 = (TextView) findViewById (R.id.ColorName94);
        ColorValue94 = (TextView) findViewById (R.id.ColorValue94);


        cardView95 = (CardView) findViewById (R.id.cardview95);
        ColorName95 = (TextView) findViewById (R.id.ColorName95);
        ColorValue95 = (TextView) findViewById (R.id.ColorValue95);


        cardView96 = (CardView) findViewById (R.id.cardview96);
        ColorName96 = (TextView) findViewById (R.id.ColorName96);
        ColorValue96 = (TextView) findViewById (R.id.ColorValue96);


        cardView97 = (CardView) findViewById (R.id.cardview97);
        ColorName97 = (TextView) findViewById (R.id.ColorName97);
        ColorValue97 = (TextView) findViewById (R.id.ColorValue97);


        cardView98 = (CardView) findViewById (R.id.cardview98);
        ColorName98 = (TextView) findViewById (R.id.ColorName98);
        ColorValue98 = (TextView) findViewById (R.id.ColorValue98);


        cardView99 = (CardView) findViewById (R.id.cardview99);
        ColorName99 = (TextView) findViewById (R.id.ColorName99);
        ColorValue99 = (TextView) findViewById (R.id.ColorValue99);


        cardView100 = (CardView) findViewById (R.id.cardview100);
        ColorName100 = (TextView) findViewById (R.id.ColorName100);
        ColorValue100 = (TextView) findViewById (R.id.ColorValue100);


        cardView101 = (CardView) findViewById (R.id.cardview101);
        ColorName101 = (TextView) findViewById (R.id.ColorName101);
        ColorValue101 = (TextView) findViewById (R.id.ColorValue101);

        cardView102 = (CardView) findViewById (R.id.cardview102);
        ColorName102 = (TextView) findViewById (R.id.ColorName102);
        ColorValue102 = (TextView) findViewById (R.id.ColorValue102);

        cardView103 = (CardView) findViewById (R.id.cardview103);
        ColorName103 = (TextView) findViewById (R.id.ColorName103);
        ColorValue103 = (TextView) findViewById (R.id.ColorValue103);

        cardView104 = (CardView) findViewById (R.id.cardview104);
        ColorName104 = (TextView) findViewById (R.id.ColorName104);
        ColorValue104 = (TextView) findViewById (R.id.ColorValue104);

        cardView105 = (CardView) findViewById (R.id.cardview105);
        ColorName105 = (TextView) findViewById (R.id.ColorName105);
        ColorValue105 = (TextView) findViewById (R.id.ColorValue105);

        cardView106 = (CardView) findViewById (R.id.cardview106);
        ColorName106 = (TextView) findViewById (R.id.ColorName106);
        ColorValue106 = (TextView) findViewById (R.id.ColorValue106);

        cardView107 = (CardView) findViewById (R.id.cardview107);
        ColorName107 = (TextView) findViewById (R.id.ColorName107);
        ColorValue107 = (TextView) findViewById (R.id.ColorValue107);

        cardView108 = (CardView) findViewById (R.id.cardview108);
        ColorName108 = (TextView) findViewById (R.id.ColorName108);
        ColorValue108 = (TextView) findViewById (R.id.ColorValue108);

        cardView109 = (CardView) findViewById (R.id.cardview109);
        ColorName109 = (TextView) findViewById (R.id.ColorName109);
        ColorValue109 = (TextView) findViewById (R.id.ColorValue109);

        cardView110 = (CardView) findViewById (R.id.cardview110);
        ColorName110 = (TextView) findViewById (R.id.ColorName110);
        ColorValue110 = (TextView) findViewById (R.id.ColorValue110);

        cardView111 = (CardView) findViewById (R.id.cardview111);
        ColorName111 = (TextView) findViewById (R.id.ColorName111);
        ColorValue111 = (TextView) findViewById (R.id.ColorValue111);

        cardView112 = (CardView) findViewById (R.id.cardview112);
        ColorName112 = (TextView) findViewById (R.id.ColorName112);
        ColorValue112 = (TextView) findViewById (R.id.ColorValue112);

        cardView113 = (CardView) findViewById (R.id.cardview113);
        ColorName113 = (TextView) findViewById (R.id.ColorName113);
        ColorValue113 = (TextView) findViewById (R.id.ColorValue113);


        cardView114 = (CardView) findViewById (R.id.cardview114);
        ColorName114 = (TextView) findViewById (R.id.ColorName114);
        ColorValue114 = (TextView) findViewById (R.id.ColorValue114);


        cardView115 = (CardView) findViewById (R.id.cardview115);
        ColorName115 = (TextView) findViewById (R.id.ColorName115);
        ColorValue115 = (TextView) findViewById (R.id.ColorValue115);


        cardView116 = (CardView) findViewById (R.id.cardview116);
        ColorName116 = (TextView) findViewById (R.id.ColorName116);
        ColorValue116 = (TextView) findViewById (R.id.ColorValue116);


        cardView117 = (CardView) findViewById (R.id.cardview117);
        ColorName117 = (TextView) findViewById (R.id.ColorName117);
        ColorValue117 = (TextView) findViewById (R.id.ColorValue117);


        cardView118 = (CardView) findViewById (R.id.cardview118);
        ColorName118 = (TextView) findViewById (R.id.ColorName118);
        ColorValue118 = (TextView) findViewById (R.id.ColorValue118);


        cardView119 = (CardView) findViewById (R.id.cardview119);
        ColorName119 = (TextView) findViewById (R.id.ColorName119);
        ColorValue119 = (TextView) findViewById (R.id.ColorValue119);


        cardView120 = (CardView) findViewById (R.id.cardview120);
        ColorName120 = (TextView) findViewById (R.id.ColorName120);
        ColorValue120 = (TextView) findViewById (R.id.ColorValue120);


        cardView121 = (CardView) findViewById (R.id.cardview121);
        ColorName121 = (TextView) findViewById (R.id.ColorName121);
        ColorValue121 = (TextView) findViewById (R.id.ColorValue121);


        cardView122 = (CardView) findViewById (R.id.cardview122);
        ColorName122 = (TextView) findViewById (R.id.ColorName122);
        ColorValue122 = (TextView) findViewById (R.id.ColorValue122);


        cardView123 = (CardView) findViewById (R.id.cardview123);
        ColorName123 = (TextView) findViewById (R.id.ColorName123);
        ColorValue123 = (TextView) findViewById (R.id.ColorValue123);


        cardView124 = (CardView) findViewById (R.id.cardview124);
        ColorName124 = (TextView) findViewById (R.id.ColorName124);
        ColorValue124 = (TextView) findViewById (R.id.ColorValue124);


        cardView125 = (CardView) findViewById (R.id.cardview125);
        ColorName125 = (TextView) findViewById (R.id.ColorName125);
        ColorValue125 = (TextView) findViewById (R.id.ColorValue125);


        cardView126 = (CardView) findViewById (R.id.cardview126);
        ColorName126 = (TextView) findViewById (R.id.ColorName126);
        ColorValue126 = (TextView) findViewById (R.id.ColorValue126);


        cardView127 = (CardView) findViewById (R.id.cardview127);
        ColorName127 = (TextView) findViewById (R.id.ColorName127);
        ColorValue127 = (TextView) findViewById (R.id.ColorValue127);


        cardView128 = (CardView) findViewById (R.id.cardview128);
        ColorName128 = (TextView) findViewById (R.id.ColorName128);
        ColorValue128 = (TextView) findViewById (R.id.ColorValue128);


        cardView129 = (CardView) findViewById (R.id.cardview129);
        ColorName129 = (TextView) findViewById (R.id.ColorName129);
        ColorValue129 = (TextView) findViewById (R.id.ColorValue129);


        cardView130 = (CardView) findViewById (R.id.cardview130);
        ColorName130 = (TextView) findViewById (R.id.ColorName130);
        ColorValue130 = (TextView) findViewById (R.id.ColorValue130);


        cardView131 = (CardView) findViewById (R.id.cardview131);
        ColorName131 = (TextView) findViewById (R.id.ColorName131);
        ColorValue131 = (TextView) findViewById (R.id.ColorValue131);


        cardView132 = (CardView) findViewById (R.id.cardview132);
        ColorName132 = (TextView) findViewById (R.id.ColorName132);
        ColorValue132 = (TextView) findViewById (R.id.ColorValue132);


        cardView133 = (CardView) findViewById (R.id.cardview133);
        ColorName133 = (TextView) findViewById (R.id.ColorName133);
        ColorValue133 = (TextView) findViewById (R.id.ColorValue133);


        cardView134 = (CardView) findViewById (R.id.cardview134);
        ColorName134 = (TextView) findViewById (R.id.ColorName134);
        ColorValue134 = (TextView) findViewById (R.id.ColorValue134);


        cardView135 = (CardView) findViewById (R.id.cardview135);
        ColorName135 = (TextView) findViewById (R.id.ColorName135);
        ColorValue135 = (TextView) findViewById (R.id.ColorValue135);


        cardView136 = (CardView) findViewById (R.id.cardview136);
        ColorName136 = (TextView) findViewById (R.id.ColorName136);
        ColorValue136 = (TextView) findViewById (R.id.ColorValue136);


        cardView137 = (CardView) findViewById (R.id.cardview137);
        ColorName137 = (TextView) findViewById (R.id.ColorName137);
        ColorValue137 = (TextView) findViewById (R.id.ColorValue137);


        cardView138 = (CardView) findViewById (R.id.cardview138);
        ColorName138 = (TextView) findViewById (R.id.ColorName138);
        ColorValue138 = (TextView) findViewById (R.id.ColorValue138);

        cardView139 = (CardView) findViewById (R.id.cardview139);
        ColorName139 = (TextView) findViewById (R.id.ColorName139);
        ColorValue139 = (TextView) findViewById (R.id.ColorValue139);


        cardView140 = (CardView) findViewById (R.id.cardview140);
        ColorName140 = (TextView) findViewById (R.id.ColorName140);
        ColorValue140 = (TextView) findViewById (R.id.ColorValue140);


        cardView141 = (CardView) findViewById (R.id.cardview141);
        ColorName141 = (TextView) findViewById (R.id.ColorName141);
        ColorValue141 = (TextView) findViewById (R.id.ColorValue141);


        cardView142 = (CardView) findViewById (R.id.cardview142);
        ColorName142 = (TextView) findViewById (R.id.ColorName142);
        ColorValue142 = (TextView) findViewById (R.id.ColorValue142);


        cardView143 = (CardView) findViewById (R.id.cardview143);
        ColorName143 = (TextView) findViewById (R.id.ColorName143);
        ColorValue143 = (TextView) findViewById (R.id.ColorValue143);


        cardView144 = (CardView) findViewById (R.id.cardview144);
        ColorName144 = (TextView) findViewById (R.id.ColorName144);
        ColorValue144 = (TextView) findViewById (R.id.ColorValue144);


        cardView145 = (CardView) findViewById (R.id.cardview145);
        ColorName145 = (TextView) findViewById (R.id.ColorName145);
        ColorValue145 = (TextView) findViewById (R.id.ColorValue145);


        cardView146 = (CardView) findViewById (R.id.cardview146);
        ColorName146 = (TextView) findViewById (R.id.ColorName146);
        ColorValue146 = (TextView) findViewById (R.id.ColorValue146);


        cardView147 = (CardView) findViewById (R.id.cardview147);
        ColorName147 = (TextView) findViewById (R.id.ColorName147);
        ColorValue147 = (TextView) findViewById (R.id.ColorValue147);


        GET_DATA = DataClass.receiJSONDATA ();

        list = new ArrayList<> ();
        stringBuilder = new StringBuilder ();
        stringBuildervalues = new StringBuilder ();

        listValues = new ArrayList<> ();
        try {

            JSONArray jsonArray = JsonParser.getNames (GET_DATA);

            for ( int i = 0; i < jsonArray.length (); i++ ) {


                list.add (jsonArray.get (i) + NEW_LINE);

            }



            for ( int i = 0; i < jsonArray.length (); i++ ) {

                listValues.add (JsonParser.getString (jsonArray.get (i) + SPACE_TEXT, GET_DATA) + NEW_LINE);

            }


        } catch (Exception e) {
            e.printStackTrace ();
        }

        //asigning the value to the corresponging object

        //ColorName1.setText (list.get (0));
        // ColorValue1.setText (listValues.get (0));
        // cardView1.setCardBackgroundColor (Color.parseColor ("#f0f8ff"));

        setValues (
                ColorName1,
                ColorValue1,
                list.get (0),
                listValues.get (0),
                cardView1,
                Color.parseColor ("#f0f8ff")
        );


        //ColorName2.setText (list.get (1));
        //ColorValue2.setText (listValues.get (1));
        //cardView2.setCardBackgroundColor (Color.parseColor ("#faebd7"));

        setValues (
                ColorName2,
                ColorValue2,
                list.get (1),
                listValues.get (1),
                cardView2,
                Color.parseColor ("#faebd7")
        );


        //ColorName3.setText (list.get (2));
        //ColorValue3.setText (listValues.get (2));
        //cardView3.setCardBackgroundColor (Color.parseColor ("#00ffff"));

        setValues (
                ColorName3,
                ColorValue3,
                list.get (2),
                listValues.get (2),
                cardView3,
                Color.parseColor ("#00ffff")
        );


        //ColorName4.setText (list.get (3));
        //ColorValue4.setText (listValues.get (3));
        //cardView4.setCardBackgroundColor (Color.parseColor ("#7fffd4"));


        setValues (
                ColorName4,
                ColorValue4,
                list.get (3),
                listValues.get (3),
                cardView4,
                Color.parseColor ("#7fffd4")
        );


        //ColorName5.setText (list.get (4));
        //ColorValue5.setText (listValues.get (4));
        //cardView5.setCardBackgroundColor (Color.parseColor ("#f0ffff"));

        setValues (
                ColorName5,
                ColorValue5,
                list.get (4),
                listValues.get (4),
                cardView5,
                Color.parseColor ("#f0ffff")
        );


        //ColorName6.setText (list.get (5));
       // ColorValue6.setText (listValues.get (5));
      //  cardView6.setCardBackgroundColor (Color.parseColor ("#f5f5dc"));


        setValues (
                ColorName6,
                ColorValue6,
                list.get (5),
                listValues.get (5),
                cardView6,
                Color.parseColor ("#f5f5dc")
        );


       // ColorName7.setText (list.get (6));
      //  ColorValue7.setText (listValues.get (6));
       // cardView7.setCardBackgroundColor (Color.parseColor ("#ffe4c4"));


        setValues (
                ColorName7,
                ColorValue7,
                list.get (6),
                listValues.get (6),
                cardView7,
                Color.parseColor ("#ffe4c4")
        );


       // ColorName8.setText (list.get (7));
        //ColorValue8.setText (listValues.get (7));
        ColorName8.setTextColor (Color.WHITE);
        ColorValue8.setTextColor (Color.WHITE);
        //cardView8.setCardBackgroundColor (Color.parseColor ("#000000"));

        setValues (
                ColorName8,
                ColorValue8,
                list.get (7),
                listValues.get (7),
                cardView8,
                Color.parseColor ("#000000")
        );


       // ColorName9.setText (list.get (8));
      ///  ColorValue9.setText (listValues.get (8));
       // cardView9.setCardBackgroundColor (Color.parseColor ("#ffebcd"));

        setValues (
                ColorName9,
                ColorValue9,
                list.get (8),
                listValues.get (8),
                cardView9,
                Color.parseColor ("#ffebcd")
        );


       // ColorName10.setText (list.get (9));
        //ColorValue10.setText (listValues.get (9));
       // cardView10.setCardBackgroundColor (Color.parseColor ("#0000ff"));


        ColorName10.setTextColor (Color.WHITE);
        ColorValue10.setTextColor(Color.WHITE);
        setValues (
                ColorName10,
                ColorValue10,
                list.get (9),
                listValues.get (9),
                cardView10,
                Color.parseColor ("#0000ff")
        );


        //ColorName11.setText (list.get (10));
        //ColorValue11.setText (listValues.get (10));
      //  cardView11.setCardBackgroundColor (Color.parseColor ("#8a2be2"));

        setValues (
                ColorName11,
                ColorValue11,
                list.get (10),
                listValues.get (10),
                cardView11,
                Color.parseColor ("#8a2be2")
        );



       // ColorName12.setText (list.get (11));
       // ColorValue12.setText (listValues.get (11));
        // cardView12.setCardBackgroundColor (Color.parseColor ("#a52a2a"));


        setValues (
                ColorName12,
                ColorValue12,
                list.get (11),
                listValues.get (11),
                cardView12,
                Color.parseColor ("#a52a2a")
        );



        //ColorName13.setText (list.get (12));
       // ColorValue13.setText (listValues.get (12));
       // cardView13.setCardBackgroundColor (Color.parseColor ("#deb887"));

        setValues (
                ColorName13,
                ColorValue13,
                list.get (12),
                listValues.get (12),
                cardView13,
                Color.parseColor ("#deb887")
        );


       // ColorName14.setText (list.get (13));
        //ColorValue14.setText (listValues.get (13));
       // cardView14.setCardBackgroundColor (Color.parseColor ("#5f9ea0"));

        setValues (
                ColorName14,
                ColorValue14,
                list.get (13),
                listValues.get (13),
                cardView14,
                Color.parseColor ("#5f9ea0")
        );


        //ColorName15.setText (list.get (14));
        //ColorValue15.setText (listValues.get (14));
       // cardView15.setCardBackgroundColor (Color.parseColor ("#7fff00"));

        setValues (
                ColorName15,
                ColorValue15,
                list.get (14),
                listValues.get (14),
                cardView15,
                Color.parseColor ("#7fff00")
        );



        //ColorName16.setText (list.get (15));
       // ColorValue16.setText (listValues.get (15));
        //cardView16.setCardBackgroundColor (Color.parseColor ("#d2691e"));

        setValues (
                ColorName16,
                ColorValue16,
                list.get (15),
                listValues.get (15),
                cardView16,
                Color.parseColor ("#d2691e")
        );

        //ColorName17.setText (list.get (16));
        //ColorValue17.setText (listValues.get (16));
       // cardView17.setCardBackgroundColor (Color.parseColor ("#ff7f50"));

        setValues (
                ColorName17,
                ColorValue17,
                list.get (16),
                listValues.get (16),
                cardView17,
                Color.parseColor ("#ff7f50")
        );


        //ColorName18.setText (list.get (17));
       // ColorValue18.setText (listValues.get (17));
        //cardView18.setCardBackgroundColor (Color.parseColor ("#6495ed"));


        setValues (
                ColorName18,
                ColorValue18,
                list.get (17),
                listValues.get (17),
                cardView18,
                Color.parseColor ("#ff7f50")
        );


        //ColorName19.setText (list.get (18));
       // ColorValue19.setText (listValues.get (18));
        //cardView19.setCardBackgroundColor (Color.parseColor ("#fff8dc"));

        setValues (
                ColorName19,
                ColorValue19,
                list.get (18),
                listValues.get (18),
                cardView19,
                Color.parseColor ("#fff8dc")
        );

        //ColorName20.setText (list.get (19));
        //ColorValue20.setText (listValues.get (19));
        //cardView20.setCardBackgroundColor (Color.parseColor ("#dc143c"));

        setValues (
                ColorName20,
                ColorValue20,
                list.get (19),
                listValues.get (19),
                cardView20,
                Color.parseColor ("#dc143c")
        );




        //ColorName21.setText (list.get (20));
        //ColorValue21.setText (listValues.get (20));
        //cardView21.setCardBackgroundColor (Color.parseColor ("#00ffff"));

        setValues (
                ColorName21,
                ColorValue21,
                list.get (20),
                listValues.get (20),
                cardView21,
                Color.parseColor ("#00ffff")
        );

        //ColorName22.setText (list.get (21));
        //ColorValue22.setText (listValues.get (21));
        //cardView22.setCardBackgroundColor (Color.parseColor ("#00008b"));

        ColorName22.setTextColor (Color.WHITE);
        ColorValue22.setTextColor (Color.WHITE);
        setValues (
                ColorName22,
                ColorValue22,
                list.get (21),
                listValues.get (21),
                cardView22,
                Color.parseColor ("#00008b")
        );


       // ColorName23.setText (list.get (22));
        //ColorValue23.setText (listValues.get (22));
       // cardView23.setCardBackgroundColor (Color.parseColor ("#008b8b"));

        setValues (
                ColorName23,
                ColorValue23,
                list.get (22),
                listValues.get (22),
                cardView23,
                Color.parseColor ("#008b8b")
        );



       // ColorName24.setText (list.get (23));
      //  ColorValue24.setText (listValues.get (23));
       // cardView24.setCardBackgroundColor (Color.parseColor ("#b8860b"));

        setValues (
                ColorName24,
                ColorValue24,
                list.get (23),
                listValues.get (23),
                cardView24,
                Color.parseColor ("#b8860b")
        );


       // ColorName25.setText (list.get (24));
        //ColorValue25.setText (listValues.get (24));
        //cardView25.setCardBackgroundColor (Color.parseColor ("#a9a9a9"));

        setValues (
                ColorName25,
                ColorValue25,
                list.get (24),
                listValues.get (24),
                cardView25,
                Color.parseColor ("#a9a9a9")
        );



        //ColorName26.setText (list.get (25));
        //ColorValue26.setText (listValues.get (25));
       // cardView26.setCardBackgroundColor (Color.parseColor ("#006400"));

        setValues (
                ColorName26,
                ColorValue26,
                list.get (25),
                listValues.get (25),
                cardView26,
                Color.parseColor ("#006400")
        );


        //ColorName27.setText (list.get (26));
        //ColorValue27.setText (listValues.get (26));
        //cardView27.setCardBackgroundColor (Color.parseColor ("#a9a9a9"));

        setValues (
                ColorName27,
                ColorValue27,
                list.get (26),
                listValues.get (26),
                cardView27,
                Color.parseColor ("#a9a9a9")
        );


       // ColorName28.setText (list.get (27));
      //  ColorValue28.setText (listValues.get (27));
       // cardView28.setCardBackgroundColor (Color.parseColor ("#bdb76b"));

        setValues (
                ColorName28,
                ColorValue28,
                list.get (27),
                listValues.get (27),
                cardView28,
                Color.parseColor ("#bdb76b")
        );


        //ColorName29.setText (list.get (28));
       // ColorValue29.setText (listValues.get (28));
        //cardView29.setCardBackgroundColor (Color.parseColor ("#8b008b"));

        setValues (
                ColorName29,
                ColorValue29,
                list.get (28),
                listValues.get (28),
                cardView29,
                Color.parseColor ("#8b008b")
        );


        //ColorName30.setText (list.get (29));
        //ColorValue30.setText (listValues.get (29));
       // cardView30.setCardBackgroundColor (Color.parseColor ("#556b2f"));

        setValues (
                ColorName30,
                ColorValue30,
                list.get (29),
                listValues.get (29),
                cardView30,
                Color.parseColor ("#556b2f")
        );


       // ColorName31.setText (list.get (30));
       // ColorValue31.setText (listValues.get (30));
       // cardView31.setCardBackgroundColor (Color.parseColor ("#ff8c00"));

        setValues (
                ColorName31,
                ColorValue31,
                list.get (30),
                listValues.get (30),
                cardView31,
                Color.parseColor ("#ff8c00")
        );


       // ColorName32.setText (list.get (31));
        //ColorValue32.setText (listValues.get (31));
       // cardView32.setCardBackgroundColor (Color.parseColor ("#9932cc"));

        setValues (
                ColorName32,
                ColorValue32,
                list.get (31),
                listValues.get (31),
                cardView32,
                Color.parseColor ("#9932cc")
        );


        //ColorName33.setText (list.get (32));
      //  ColorValue33.setText (listValues.get (32));
        ColorName33.setTextColor (Color.WHITE);
        ColorValue33.setTextColor (Color.WHITE);
       // cardView33.setCardBackgroundColor (Color.parseColor ("#8b0000"));

        setValues (
                ColorName33,
                ColorValue33,
                list.get (32),
                listValues.get (32),
                cardView33,
                Color.parseColor ("#8b0000")
        );


        //ColorName34.setText (list.get (33));
        //ColorValue34.setText (listValues.get (33));
        //cardView34.setCardBackgroundColor (Color.parseColor ("#e9967a"));

        setValues (
                ColorName34,
                ColorValue34,
                list.get (33),
                listValues.get (33),
                cardView34,
                Color.parseColor ("#e9967a")
        );


        //ColorName35.setText (list.get (34));
       // ColorValue35.setText (listValues.get (34));
       // cardView35.setCardBackgroundColor (Color.parseColor ("#8fbc8f"));

        setValues (
                ColorName35,
                ColorValue35,
                list.get (34),
                listValues.get (34),
                cardView35,
                Color.parseColor ("#8fbc8f")
        );


        //ColorName36.setText (list.get (35));
       // ColorValue36.setText (listValues.get (35));
        //cardView36.setCardBackgroundColor (Color.parseColor ("#483d8b"));


        setValues (
                ColorName36,
                ColorValue36,
                list.get (35),
                listValues.get (35),
                cardView36,
                Color.parseColor ("#483d8b")
        );


        // ColorName37.setText (list.get (36));
        //ColorValue37.setText (listValues.get (36));
        //cardView37.setCardBackgroundColor (Color.parseColor ("#2f4f4f"));

        setValues (ColorName37,
                ColorValue37,
                list.get (36),
                listValues.get (36),
                cardView37,
                Color.parseColor ("#2f4f4f")
        );

        setValues (ColorName38,
                ColorValue38,
                list.get (37),
                listValues.get (37),
                cardView38,
                Color.parseColor ("#2f4f4f")
        );

        setValues (ColorName39,
                ColorValue39,
                list.get (38),
                listValues.get (38),
                cardView39,
                Color.parseColor ("#00ced1")
        );

        setValues (ColorName40,
                ColorValue40,
                list.get (39),
                listValues.get (39),
                cardView40,
                Color.parseColor ("#9400d3")
        );

        setValues (ColorName41,
                ColorValue41,
                list.get (40),
                listValues.get (40),
                cardView41,
                Color.parseColor ("#ff1493")
        );

        setValues (ColorName42,
                ColorValue42,
                list.get (41),
                listValues.get (41),
                cardView42,
                Color.parseColor ("#00bfff")
        );

        setValues (ColorName43,
                ColorValue43,
                list.get (42),
                listValues.get (42),
                cardView43,
                Color.parseColor ("#696969")
        );

        setValues (ColorName44,
                ColorValue44,
                list.get (43),
                listValues.get (43),
                cardView44,
                Color.parseColor ("#696969")
        );

        setValues (ColorName45,
                ColorValue45,
                list.get (44),
                listValues.get (44),
                cardView45,
                Color.parseColor ("#1e90ff")
        );

        setValues (ColorName46,
                ColorValue46,
                list.get (45),
                listValues.get (45),
                cardView46,
                Color.parseColor ("#b22222")
        );

        setValues (ColorName47,
                ColorValue47,
                list.get (46),
                listValues.get (46),
                cardView47,
                Color.parseColor ("#fffaf0")
        );

        setValues (ColorName48,
                ColorValue48,
                list.get (47),
                listValues.get (47),
                cardView48,
                Color.parseColor ("#228b22")
        );

        setValues (ColorName49,
                ColorValue49,
                list.get (48),
                listValues.get (48),
                cardView49,
                Color.parseColor ("#ff00ff")
        );

        setValues (ColorName50,
                ColorValue50,
                list.get (49),
                listValues.get (49),
                cardView50,
                Color.parseColor ("#dcdcdc")
        );

        setValues (ColorName51,
                ColorValue51,
                list.get (50),
                listValues.get (50),
                cardView51,
                Color.parseColor ("#f8f8ff")
        );

        setValues (ColorName52,
                ColorValue52,
                list.get (51),
                listValues.get (51),
                cardView52,
                Color.parseColor ("#ffd700")
        );

        setValues (ColorName53,
                ColorValue53,
                list.get (52),
                listValues.get (52),
                cardView53,
                Color.parseColor ("#daa520")
        );

        setValues (ColorName54,
                ColorValue54,
                list.get (53),
                listValues.get (53),
                cardView54,
                Color.parseColor ("#808080")
        );

        setValues (ColorName55,
                ColorValue55,
                list.get (54),
                listValues.get (54),
                cardView55,
                Color.parseColor ("#008000")
        );

        setValues (ColorName56,
                ColorValue56,
                list.get (55),
                listValues.get (55),
                cardView56,
                Color.parseColor ("#adff2f")
        );

        setValues (ColorName57,
                ColorValue57,
                list.get (56),
                listValues.get (56),
                cardView57,
                Color.parseColor ("#808080")
        );

        setValues (ColorName58,
                ColorValue58,
                list.get (57),
                listValues.get (57),
                cardView58,
                Color.parseColor ("#f0fff0")
        );

        setValues (ColorName59,
                ColorValue59,
                list.get (58),
                listValues.get (58),
                cardView59,
                Color.parseColor ("#ff69b4")
        );

        setValues (ColorName60,
                ColorValue60,
                list.get (59),
                listValues.get (59),
                cardView60,
                Color.parseColor ("#cd5c5c")
        );

        ColorName61.setTextColor(Color.WHITE);
        ColorValue61.setTextColor(Color.WHITE);
        setValues (ColorName61,
                ColorValue61,
                list.get (60),
                listValues.get (60),
                cardView61,
                Color.parseColor ("#4b0082")
        );

        setValues (ColorName62,
                ColorValue62,
                list.get (61),
                listValues.get (61),
                cardView62,
                Color.parseColor ("#fffff0")
        );

        setValues (ColorName63,
                ColorValue63,
                list.get (62),
                listValues.get (62),
                cardView63,
                Color.parseColor ("#f0e68c")
        );

        setValues (ColorName64,
                ColorValue64,
                list.get (63),
                listValues.get (63),
                cardView64,
                Color.parseColor ("#e6e6fa")
        );

        setValues (ColorName65,
                ColorValue65,
                list.get (64),
                listValues.get (64),
                cardView65,
                Color.parseColor ("#fff0f5")
        );

        setValues (ColorName66,
                ColorValue66,
                list.get (65),
                listValues.get (65),
                cardView66,
                Color.parseColor ("#7cfc00")
        );

        setValues (ColorName67,
                ColorValue67,
                list.get (66),
                listValues.get (66),
                cardView67,
                Color.parseColor ("#fffacd")
        );

        setValues (ColorName68,
                ColorValue68,
                list.get (67),
                listValues.get (67),
                cardView68,
                Color.parseColor ("#add8e6")
        );

        setValues (ColorName69,
                ColorValue69,
                list.get (68),
                listValues.get (68),
                cardView69,
                Color.parseColor ("#f08080")
        );

        setValues (ColorName70,
                ColorValue70,
                list.get (69),
                listValues.get (69),
                cardView70,
                Color.parseColor ("#e0ffff")
        );

        setValues (ColorName71,
                ColorValue71,
                list.get (70),
                listValues.get (70),
                cardView71,
                Color.parseColor ("#fafad2")
        );

        setValues (ColorName72,
                ColorValue72,
                list.get (71),
                listValues.get (71),
                cardView72,
                Color.parseColor ("#d3d3d3")
        );

        setValues (ColorName73,
                ColorValue73,
                list.get (72),
                listValues.get (72),
                cardView73,
                Color.parseColor ("#90ee90")
        );

        setValues (ColorName74,
                ColorValue74,
                list.get (73),
                listValues.get (73),
                cardView74,
                Color.parseColor ("#d3d3d3")
        );

        setValues (ColorName75,
                ColorValue75,
                list.get (74),
                listValues.get (74),
                cardView75,
                Color.parseColor ("#ffb6c1")
        );

        setValues (ColorName76,
                ColorValue76,
                list.get (75),
                listValues.get (75),
                cardView76,
                Color.parseColor ("#ffa07a")
        );

        setValues (ColorName77,
                ColorValue77,
                list.get (76),
                listValues.get (76),
                cardView77,
                Color.parseColor ("#20b2aa")
        );

        setValues (ColorName78,
                ColorValue78,
                list.get (77),
                listValues.get (77),
                cardView78,
                Color.parseColor ("#87cefa")
        );

        setValues (ColorName79,
                ColorValue79,
                list.get (78),
                listValues.get (78),
                cardView79,
                Color.parseColor ("#778899")
        );

        setValues (ColorName80,
                ColorValue80,
                list.get (79),
                listValues.get (79),
                cardView80,
                Color.parseColor ("#778899")//778899
        );

        setValues (ColorName81,
                ColorValue81,
                list.get (80),
                listValues.get (80),
                cardView81,
                Color.parseColor ("#b0c4de")//b0c4de
        );

        setValues (ColorName82,
                ColorValue82,
                list.get (81),
                listValues.get (81),
                cardView82,
                Color.parseColor ("#ffffe0")//ffffe0
        );

        setValues (ColorName83,
                ColorValue83,
                list.get (82),
                listValues.get (82),
                cardView83,
                Color.parseColor ("#00ff00")//00ff00
        );

        setValues (ColorName84,
                ColorValue84,
                list.get (83),
                listValues.get (83),
                cardView84,
                Color.parseColor ("#32cd32")//32cd32
        );

        setValues (ColorName85,
                ColorValue85,
                list.get (84),
                listValues.get (84),
                cardView85,
                Color.parseColor ("#faf0e6")//faf0e6
        );

        setValues (ColorName86,
                ColorValue86,
                list.get (85),
                listValues.get (85),
                cardView86,
                Color.parseColor ("#ff00ff")//ff00ff
        );

        setValues (ColorName87,
                ColorValue87,
                list.get (86),
                listValues.get (86),
                cardView87,
                Color.parseColor ("#800000")//800000
        );

        setValues (ColorName88,
                ColorValue88,
                list.get (87),
                listValues.get (87),
                cardView88,
                Color.parseColor ("#66cdaa")//66cdaa
        );

        setValues (ColorName89,
                ColorValue89,
                list.get (88),
                listValues.get (88),
                cardView89,
                Color.parseColor ("#0000cd")//0000cd
        );

        setValues (ColorName90,
                ColorValue90,
                list.get (89),
                listValues.get (89),
                cardView90,
                Color.parseColor ("#ba55d3")//ba55d3
        );

        setValues (ColorName91,
                ColorValue91,
                list.get (90),
                listValues.get (90),
                cardView91,
                Color.parseColor ("#9370db")//9370db
        );

        setValues (ColorName92,
                ColorValue92,
                list.get (91),
                listValues.get (91),
                cardView92,
                Color.parseColor ("#3cb371")//3cb371
        );

        setValues (ColorName93,
                ColorValue93,
                list.get (92),
                listValues.get (92),
                cardView93,
                Color.parseColor ("#7b68ee")//7b68ee
        );

        setValues (ColorName94,
                ColorValue94,
                list.get (93),
                listValues.get (93),
                cardView94,
                Color.parseColor ("#00fa9a")//00fa9a
        );

        setValues(ColorName95,
                ColorValue95,
                list.get (94),
                listValues.get (94),
                cardView95,
                Color.parseColor ("#48d1cc")//48d1cc
        );

        setValues (ColorName96,
                ColorValue96,
                list.get (95),
                listValues.get (95),
                cardView96,
                Color.parseColor ("#c71585")//c71585
        );

        setValues (ColorName97,
                ColorValue97,
                list.get (96),
                listValues.get (96),
                cardView97,
                Color.parseColor ("#191970")//191970
        );

        setValues (ColorName98,
                ColorValue98,
                list.get (97),
                listValues.get (97),
                cardView98,
                Color.parseColor ("#f5fffa")//f5fffa
        );

        setValues (ColorName99,
                ColorValue99,
                list.get (98),
                listValues.get (98),
                cardView99,
                Color.parseColor ("#ffe4e1")//ffe4e1
        );

        setValues(ColorName100,
                ColorValue100,
                list.get (99),
                listValues.get (99),
                cardView100,
                Color.parseColor ("#ffe4b5")//ffe4b5
        );

        setValues (ColorName101,
                ColorValue101,
                list.get (100),
                listValues.get (100),
                cardView101,
                Color.parseColor ("#ffdead")//ffdead
        );

        setValues (ColorName102,
                ColorValue102,
                list.get (101),
                listValues.get (101),
                cardView102,
                Color.parseColor ("#000080")//000080
        );

        setValues (ColorName103,
                ColorValue103,
                list.get (102),
                listValues.get (102),
                cardView103,
                Color.parseColor ("#fdf5e6")//fdf5e6
        );

        setValues (ColorName104,
                ColorValue104,
                list.get (103),
                listValues.get (103),
                cardView104,
                Color.parseColor ("#808000")//808000
        );

        setValues (ColorName105,
                ColorValue105,
                list.get (104),
                listValues.get (104),
                cardView105,
                Color.parseColor ("#6b8e23")//ffa500
        );

        setValues (ColorName106,
                ColorValue106,
                list.get (105),
                listValues.get (105),
                cardView106,
                Color.parseColor ("#ffa500")//ffa500
        );

        setValues (ColorName107,
                ColorValue107,
                list.get (106),
                listValues.get (106),
                cardView107,
                Color.parseColor ("#ff5400")//ff5400
        );

        setValues (ColorName108,
                ColorValue108,
                list.get (107),
                listValues.get (107),
                cardView108,
                Color.parseColor ("#da70d6")//da70d6
        );

        setValues (ColorName109,
                ColorValue109,
                list.get (108),
                listValues.get (108),
                cardView109,
                Color.parseColor ("#eee8aa")//eee8aa
        );

        setValues (ColorName110,
                ColorValue110,
                list.get (109),
                listValues.get (109),
                cardView110,
                Color.parseColor ("#98fb98")//98fb98
        );

        setValues (ColorName111,
                ColorValue111,
                list.get (110),
                listValues.get (110),
                cardView111,
                Color.parseColor ("#afeeee")//afeeee
        );

        setValues (ColorName112,
                ColorValue112,
                list.get (111),
                listValues.get (111),
                cardView112,
                Color.parseColor ("#db7093")//db7093
        );

        setValues (ColorName113,
                ColorValue113,
                list.get (112),
                listValues.get (112),
                cardView113,
                Color.parseColor ("#ffefd5")//ffefd5
        );

        setValues (ColorName114,
                ColorValue114,
                list.get (113),
                listValues.get (113),
                cardView114,
                Color.parseColor ("#708090")//708090
        );

        setValues (ColorName115,
                ColorValue115,
                list.get (114),
                listValues.get (114),
                cardView115,
                Color.parseColor ("#cd853f")//cd853f
        );

        setValues (ColorName116,
                ColorValue116,
                list.get (115),
                listValues.get (115),
                cardView116,
                Color.parseColor ("#ffc0cb")//ffc0cb
        );

        setValues (ColorName117,
                ColorValue117,
                list.get (116),
                listValues.get (116),
                cardView117,
                Color.parseColor ("#dda0dd")//dda0dd
        );

        setValues (ColorName118,
                ColorValue118,
                list.get (117),
                listValues.get (117),
                cardView118,
                Color.parseColor ("#b0e0e6")//b0e0e6
        );

        setValues (ColorName119,
                ColorValue119,
                list.get (118),
                listValues.get (118),
                cardView119,
                Color.parseColor ("#800080")//800080
        );

        setValues (ColorName120,
                ColorValue120,
                list.get (119),
                listValues.get (119),
                cardView120,
                Color.parseColor ("#663399")//663399
        );

        setValues(ColorName121,
                ColorValue121,
                list.get (120),
                listValues.get (120),
                cardView121,
                Color.parseColor ("#ff0000")//663399
        );

        setValues (ColorName122,
                ColorValue122,
                list.get (121),
                listValues.get (121),
                cardView122,
                Color.parseColor ("#bc8f8f")//bc8f8f
        );

        setValues (ColorName123,
                ColorValue123,
                list.get (122),
                listValues.get (122),
                cardView123,
                Color.parseColor ("#4169e1")//4169e1
        );

        setValues (ColorName124,
                ColorValue124,
                list.get (123),
                listValues.get (123),
                cardView124,
                Color.parseColor ("#8b4513")//8b4513
        );

        setValues (ColorName125,
                ColorValue125,
                list.get (124),
                listValues.get (124),
                cardView125,
                Color.parseColor ("#fa8072")//fa8072
        );

        setValues (ColorName126,
                ColorValue126,
                list.get (125),
                listValues.get (125),
                cardView126,
                Color.parseColor ("#f4af60")//f4af60
        );

        setValues (ColorName127,
                ColorValue127,
                list.get (126),
                listValues.get (126),
                cardView127,
                Color.parseColor ("#2e8b57")//2e8b57
        );

        setValues (ColorName128,
                ColorValue128,
                list.get (127),
                listValues.get (127),
                cardView128,
                Color.parseColor ("#fff5ee")//fff5ee
        );

        setValues (ColorName129,
                ColorValue129,
                list.get (128),
                listValues.get (128),
                cardView129,
                Color.parseColor ("#a0522d")//a0522d
        );

        ColorName130.setTextColor(Color.BLACK);
        ColorValue130.setTextColor(Color.BLACK);
        setValues (ColorName130,
                ColorValue130,
                list.get (129),
                listValues.get (129),
                cardView130,
                Color.parseColor ("#c0c0c0")//0c0c0c
        );

        setValues (ColorName131,
                ColorValue131,
                list.get (130),
                listValues.get (130),
                cardView131,
                Color.parseColor ("#87ceeb")//87ceeb
        );

        ColorName132.setTextColor(Color.BLACK);
        ColorValue132.setTextColor(Color.BLACK);
        setValues (ColorName132,
                ColorValue132,
                list.get (131),
                listValues.get (131),
                cardView132,
                Color.parseColor ("#6a5acd")//87ceeb
        );

        setValues (ColorName133,
                ColorValue133,
                list.get (132),
                listValues.get (132),
                cardView133,
                Color.parseColor ("#708090")//87ceeb
        );

        setValues(ColorName134,
                ColorValue134,
                list.get (133),
                listValues.get (133),
                cardView134,
                Color.parseColor ("#708090")//87ceeb
        );

        setValues(ColorName135,
                ColorValue135,
                list.get (134),
                listValues.get (134),
                cardView135,
                Color.parseColor ("#fffafa")//87ceeb
        );

        setValues (ColorName136,
                ColorValue136,
                list.get (135),
                listValues.get (135),
                cardView136,
                Color.parseColor ("#00ff7f")//87ceeb
        );

        setValues(ColorName137,
                ColorValue137,
                list.get (136),
                listValues.get (136),
                cardView137,
                Color.parseColor ("#4682b4")//87ceeb
        );

        setValues (ColorName138,
                ColorValue138,
                list.get (137),
                listValues.get (137),
                cardView138,
                Color.parseColor ("#d2b48c")//87ceeb
        );

        setValues (ColorName139,
                ColorValue139,
                list.get (138),
                listValues.get (138),
                cardView139,
                Color.parseColor ("#008080")//87ceeb
        );

        setValues (ColorName140,
                ColorValue140,
                list.get (139),
                listValues.get (139),
                cardView140,
                Color.parseColor ("#d8bfd8")//87ceeb
        );

        setValues (ColorName141,
                ColorValue141,
                list.get (140),
                listValues.get (140),
                cardView141,
                Color.parseColor ("#ff6347")//87ceeb
        );

        setValues (ColorName142,
                ColorValue142,
                list.get (141),
                listValues.get (141),
                cardView142,
                Color.parseColor ("#40e0d0")//87ceeb
        );

        setValues (ColorName143,
                ColorValue143,
                list.get (142),
                listValues.get (142),
                cardView143,
                Color.parseColor ("#ee82ee")//87ceeb
        );

        setValues (ColorName144,
                ColorValue144,
                list.get (143),
                listValues.get (143),
                cardView144,
                Color.parseColor ("#f5deb3")//87ceeb
        );

        setValues (ColorName145,
                ColorValue145,
                list.get (144),
                listValues.get (144),
                cardView145,
                Color.parseColor ("#ffffff")//87ceeb
        );

        setValues (ColorName146,
                ColorValue146,
                list.get (145),
                listValues.get (145),
                cardView146,
                Color.parseColor ("#f5f5f5")//87ceeb
        );

        setValues (ColorName147,
                ColorValue147,
                list.get (146),
                listValues.get (146),
                cardView147,
                Color.parseColor ("#ffff00")//87ceeb
        );

//        cardView1.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick (View v) {
//                Intent intent  = new Intent (ColorsActivity.this,ViewColorActivity.class);
//                String string = listValues.get (0);
//                String[] strings = {string};
//                intent.putExtra ("ColorValue",strings[0]);
//                startActivity (intent);
//            }
//        });
//
//        cardView2.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick (View v) {
//                Intent intent  = new Intent (ColorsActivity.this,ViewColorActivity.class);
//                intent.putExtra ("ColorValue",listValues.get (1));
//                startActivity (intent);
//            }
//        });
//
//        cardView3.setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick (View v) {
//                Intent intent  = new Intent (ColorsActivity.this,ViewColorActivity.class);
//                intent.putExtra ("ColorValue",listValues.get (2));
//                startActivity (intent);
//            }
//        });

    }

    public void setValues (TextView textColorName, TextView textColorValue, String ColorName, String ColorValue, CardView cardView, int colorintValue) {

        textColorName.setText (ColorName);
        textColorValue.setText (ColorValue);
        cardView.setCardBackgroundColor (colorintValue);

    }

    public void setValues1 (TextView textColorName, TextView textColorValue, String ColorName, String ColorValue) {
        textColorName.setText (ColorName);
        textColorValue.setText (ColorValue);
    }

}
