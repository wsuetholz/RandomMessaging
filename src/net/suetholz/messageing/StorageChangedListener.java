/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageStorageChangedListener;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.api.MessageType;
import net.suetholz.messageing.exceptions.NullStringParameterException;

/**
 *
 * @author wsuetholz
 */
public class StorageChangedListener implements MessageStorageChangedListener {
    private MessageStorage storage;

    public StorageChangedListener(MessageStorage storage) {
	if (storage == null) {
	    throw new NullStringParameterException();
	}

	this.storage = storage;
    }

    @Override
    public final void newMessageProduced(MessageType message) {
	if (message == null) {
	    throw new NullStringParameterException();
	}
	storage.addMessage(message);
    }

    @Override
    public final void oldMessageRemoved(MessageType message) {
	if (message == null) {
	    throw new NullStringParameterException();
	}
	storage.removeMessage(message);
    }

}
