package br.com.lapic.thomas.fsm_app.connection;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;

/**
 * Created by thomas on 09/09/17.
 */

public class MulticastGroup extends MulticastManager {

    private final String TAG = this.getClass().getSimpleName();

    public MulticastGroup(Context context, String tag, int multicastPort) {
        super(context, tag, multicastPort);
    }

    @Override
    protected Runnable getIncomingMessageAnalyseRunnable() {
        Log.e(TAG, incomingMessage.getMessage());
        return null;
    }
}
