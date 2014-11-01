package net.suetholz.messageing.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class RandomMessageProducer implements MessageProducer {

    private static final String MESSAGE_IS_NULL = "Message parameter invalid!";

    private List<MessageType> messageList;

    public RandomMessageProducer() {
	this.messageList = new ArrayList<>();
    }

    /**
     * Get the value of messageList
     *
     * @return the value of messageList
     */
    public List<MessageType> getMessageList() {
	return messageList;
    }

    /**
     * Add a Message to the messageList
     *
     * @param message
     */
    public void addMessage(MessageType message) {
	// Note: 
	// Because in practice I believe that adding messages will happen
	// less frequently than producing a random message. The transformation
	// to a Set and back to a List will happen in this function.  That is 
	// a fairly costly operation, and still bears some additional thought
	// to tune things better....
	if (message == null) {
	    throw new IllegalArgumentException(MESSAGE_IS_NULL);
	}

	messageList.add(message);
	messageList = new ArrayList<>(new HashSet<MessageType>(messageList));
    }

    public void removeMessage(MessageType message) {
	if (message == null) {
	    throw new IllegalArgumentException(MESSAGE_IS_NULL);
	}

	messageList.remove(message);
    }

    @Override
    public MessageType produceMessage() {
	Random r = new Random(System.nanoTime());
	int index = r.nextInt(messageList.size());

	return (messageList.get(index));
    }

    @Override
    public int hashCode() {
	int hash = 7;
	hash = 17 * hash + Objects.hashCode(this.messageList);
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final RandomMessageProducer other = (RandomMessageProducer) obj;
	if (!Objects.equals(this.messageList, other.messageList)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "RandomMessageProducer{" + "messageList=" + messageList.toString() + '}';
    }

}
