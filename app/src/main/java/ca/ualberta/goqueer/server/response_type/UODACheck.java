package ca.ualberta.goqueer.server.response_type;

import android.util.Log;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;


import java.io.Serializable;

import ca.ualberta.goqueer.config.Constants;


/**
 * Created by bamdad on 7/29/2016.
 */
public class UODACheck extends DataObject implements Serializable {
    private boolean valid;

    public UODACheck(String input) {

        JsonElement rootElement = new JsonParser().parse(input);

        if (rootElement != null && rootElement.isJsonObject()) {
            this.valid = optGetBool(rootElement.getAsJsonObject(), Constants.UODAResponse.VALID_TAG);
        } else {
            this.valid = false;
            Log.e(Constants.LOG_TAG, "Failed to parse UResponse with string value: " + input);
        }
    }

    public boolean isValid() {
        return valid;
    }
}
