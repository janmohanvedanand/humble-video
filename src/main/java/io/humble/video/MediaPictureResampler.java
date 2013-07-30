/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Converts {@link MediaPicture} objects of a given width, height and 
 * format to a new  
 * width, height or format.  
 */
public class MediaPictureResampler extends Configurable {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaPictureResampler(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGMediaPictureResamplerUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaPictureResampler(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGMediaPictureResamplerUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaPictureResampler obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaPictureResampler object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaPictureResampler copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaPictureResampler(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaPictureResampler)
      equal = (((MediaPictureResampler)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Get the width in pixels we expect on the input frame to the resampler. 
 *  
 * @return	The width we expect on the input frame to the resampler. 
 *		  
 */
  public int getInputWidth() {
    return VideoJNI.MediaPictureResampler_getInputWidth(swigCPtr, this);
  }

/**
 * Get the height in pixels we expect on the input frame to the resampler. 
 *  
 * @return	The height we expect on the input frame to the resampler. 
 *		  
 */
  public int getInputHeight() {
    return VideoJNI.MediaPictureResampler_getInputHeight(swigCPtr, this);
  }

/**
 * Get the input pixel format.  
 * @return	The pixel format we expect on the input frame to the resampler. 
 *		  
 */
  public PixelFormat.Type getInputFormat() {
    return PixelFormat.Type.swigToEnum(VideoJNI.MediaPictureResampler_getInputFormat(swigCPtr, this));
  }

/**
 * Get the output width, in pixels.  
 * @return	The width we will resample the output frame to  
 */
  public int getOutputWidth() {
    return VideoJNI.MediaPictureResampler_getOutputWidth(swigCPtr, this);
  }

/**
 * Get the output height, in pixels.  
 * @return	The height we will resample the output frame to  
 */
  public int getOutputHeight() {
    return VideoJNI.MediaPictureResampler_getOutputHeight(swigCPtr, this);
  }

/**
 * Get the output pixel format.  
 * @return	The pixel format we will resample the output frame to  
 */
  public PixelFormat.Type getOutputFormat() {
    return PixelFormat.Type.swigToEnum(VideoJNI.MediaPictureResampler_getOutputFormat(swigCPtr, this));
  }

/**
 * Resample in to out based on the resampler parameters.  
 * Resamples the in picture based on the parameters set when  
 * this resampler was constructed.  
 * @param	out The picture we'll resample to. Check  
 * {@link MediaPicture#isComplete()} after the call.  
 * @param	in The picture we'll resample from.  
 * @return	>= 0 on success; <0 on error.  
 */
  public int resample(MediaPicture out, MediaPicture in) {
    return VideoJNI.MediaPictureResampler_resample(swigCPtr, this, MediaPicture.getCPtr(out), out, MediaPicture.getCPtr(in), in);
  }

/**
 * Get a new picture resampler.  
 * @param	outputWidth The width in pixels you want to output frame to 
 *		 have.  
 * @param	outputHeight The height in pixels you want to output frame 
 *		 to have.  
 * @param	outputFmt The pixel format of the output frame.  
 * @param	inputWidth The width in pixels the input frame will be in. 
 *		  
 * @param	inputHeight The height in pixels the input frame will be in. 
 *		  
 * @param	inputFmt The pixel format of the input frame.  
 * @return	a new object, or null if we cannot allocate one.  
 */
  public static MediaPictureResampler make(int outputWidth, int outputHeight, PixelFormat.Type outputFmt, int inputWidth, int inputHeight, PixelFormat.Type inputFmt) {
    long cPtr = VideoJNI.MediaPictureResampler_make(outputWidth, outputHeight, outputFmt.swigValue(), inputWidth, inputHeight, inputFmt.swigValue());
    return (cPtr == 0) ? null : new MediaPictureResampler(cPtr, false);
  }

}