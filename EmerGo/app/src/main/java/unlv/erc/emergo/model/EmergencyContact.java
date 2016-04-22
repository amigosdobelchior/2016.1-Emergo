/**
 * EmergencyContatct.java
 */

package unlv.erc.emergo.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Arrays;


public class EmergencyContact {

    private String name;
    private Integer phone[];

    public EmergencyContact(String name, Integer[] phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getPhone() {
        return phone;
    }

    public void setPhone(Integer[] phone) {
        this.phone = phone;
    }


}
