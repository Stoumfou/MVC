package fr.ece.pambourg.mvc.view;

import java.awt.event.ActionListener;
import javax.swing.text.JTextComponent;

public interface GUIListener {
	ActionListener getAddUserListener(JTextComponent textComponent);
}
