package com.aha.pdftools.gui;

public interface ProgressDisplay {
	void startTask(String message, int max, boolean cancelable);
	void setProgress(int nv);
	void setNote(String note);
	boolean isCanceled();
	void endTask();
}
