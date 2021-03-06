package com.silverpeas.silvercrawler.control;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * This class is the result of a dragNDrop of folders and path in SilverCrawler.
 *
 * @author Ludovic Bertin
 *
 */
public class UploadItem {
  int id = -1;
  String fileName = null;
  File parentRelativePath = null;
  boolean itemAlreadyExists = false;
  boolean replace = false;
  private boolean copyFailed;
  private IOException copyFailedException;

  private String getFileName() {
    return fileName;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public File getRelativePath() {
    return FileUtils.getFile(parentRelativePath, getFileName());
  }

  public void setParentRelativePath(File parentRelativePath) {
    this.parentRelativePath = parentRelativePath;
  }

  public boolean isItemAlreadyExists() {
    return itemAlreadyExists;
  }

  public void setItemAlreadyExists(boolean itemAlreadyExists) {
    this.itemAlreadyExists = itemAlreadyExists;
  }

  public boolean isReplace() {
    return replace;
  }

  public void setReplace(boolean replace) {
    this.replace = replace;
  }

  public void setCopyFailed(IOException e) {
    this.copyFailed = true;
    this.copyFailedException = e;
  }

  public boolean isCopyFailed() {
    return copyFailed;
  }

  public IOException getCopyFailedException() {
    return copyFailedException;
  }

  public void setCopyFailedException(IOException copyFailedException) {
    this.copyFailedException = copyFailedException;
  }

}
