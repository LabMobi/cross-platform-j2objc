//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: jar:file:/Users/lauris/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.3.1/563dcb685903c96ce8abbd03adf7fa49e19aa8b4/gson-2.3.1-sources.jar!com/google/gson/annotations/Expose.java
//

#ifndef _Expose_H_
#define _Expose_H_

#include "J2ObjC_header.h"
#include "java/lang/annotation/Annotation.h"

@protocol ComGoogleGsonAnnotationsExpose < JavaLangAnnotationAnnotation >

@property (readonly) jboolean serialize;
@property (readonly) jboolean deserialize;

@end

@interface ComGoogleGsonAnnotationsExpose : NSObject < ComGoogleGsonAnnotationsExpose > {
 @private
  jboolean serialize_;
  jboolean deserialize_;
}

- (instancetype)initWithDeserialize:(jboolean)deserialize__ withSerialize:(jboolean)serialize__;

+ (jboolean)serializeDefault;
+ (jboolean)deserializeDefault;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleGsonAnnotationsExpose)

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleGsonAnnotationsExpose)

#endif // _Expose_H_
