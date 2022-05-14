package com.example.jfxccrefactor;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CCController {
    @FXML                           //there should be a way to group these
    private TextField ccn;
    @FXML
    private TextField sec;
    @FXML
    private ImageView cc_image;
    @FXML
    private ImageView yn;

    @FXML
    protected void CCValidate() {
        String v_regex = "^([4]{1})[0-9]{15}$";
        String ax_regex = "^3[47][0-9]{14}$";
        String jcb_regex = "^35[0-9]{14}$";
        String mc_regex = "^([5]{1})[0-9]{15}$";

        Pattern p1 = Pattern.compile(v_regex);
        Matcher m1 = p1.matcher(ccn.getText());
        boolean b1 = m1.matches();

        Pattern p2 = Pattern.compile(ax_regex);
        Matcher m2 = p2.matcher(ccn.getText());
        boolean b2 = m2.matches();

        Pattern p3 = Pattern.compile(jcb_regex);
        Matcher m3 = p3.matcher(ccn.getText());
        boolean b3 = m3.matches();

        Pattern p4 = Pattern.compile(mc_regex);
        Matcher m4 = p4.matcher(ccn.getText());
        boolean b4 = m4.matches();

        if (b1 == true) {
            cc_image.setImage(new Image("https://www.freeiconspng.com/thumbs/visa-icon/visa-icon-0.png"));
            yn.setImage(new Image("https://www.shareicon.net/data/256x256/2016/08/20/817720_check_395x512.png"));
            sec.setText("###");
        } else if (b2 == true) {
            cc_image.setImage(new Image("https://icons.iconarchive.com/icons/designbolts/credit-card-payment/256/American-Express-icon.png"));
            yn.setImage(new Image("https://www.shareicon.net/data/256x256/2016/08/20/817720_check_395x512.png"));
            sec.setText("####");
        } else if (b3 == true) {
            cc_image.setImage(new Image("https://cdn.iconscout.com/icon/free/png-256/jcb-credit-debit-card-bank-transaction-32305.png"));
            yn.setImage(new Image("https://www.shareicon.net/data/256x256/2016/08/20/817720_check_395x512.png"));
            sec.setText("###");
        } else if (b4 == true) {
            cc_image.setImage(new Image("https://icons.iconarchive.com/icons/designbolts/credit-card-payment/256/Master-Card-Blue-icon.png"));
            yn.setImage(new Image("https://www.shareicon.net/data/256x256/2016/08/20/817720_check_395x512.png"));
            sec.setText("###");
        } else {
            cc_image.setImage(new Image("https://icons.veryicon.com/png/System/iOS7%20Minimal/Shopping%20Credit%20card.png"));
            yn.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Flat_cross_icon.svg/1200px-Flat_cross_icon.svg.png"));
            ccn.setText("Invalid Card #");
            sec.setText("");
        }
    }
};

