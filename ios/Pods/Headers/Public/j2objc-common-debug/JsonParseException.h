//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: jar:file:/Users/lauris/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.3.1/563dcb685903c96ce8abbd03adf7fa49e19aa8b4/gson-2.3.1-sources.jar!com/google/gson/JsonParseException.java
//

#ifndef _JsonParseException_H_
#define _JsonParseException_H_

#include "J2ObjC_header.h"
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

#define ComGoogleGsonJsonParseException_serialVersionUID -4086729973971783390LL

@interface ComGoogleGsonJsonParseException : JavaLangRuntimeException

#pragma mark Public

- (instancetype)initWithNSString:(NSString *)msg;

- (instancetype)initWithNSString:(NSString *)msg
           withJavaLangThrowable:(JavaLangThrowable *)cause;

- (instancetype)initWithJavaLangThrowable:(JavaLangThrowable *)cause;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleGsonJsonParseException)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonJsonParseException, serialVersionUID, jlong)

FOUNDATION_EXPORT void ComGoogleGsonJsonParseException_initWithNSString_(ComGoogleGsonJsonParseException *self, NSString *msg);

FOUNDATION_EXPORT ComGoogleGsonJsonParseException *new_ComGoogleGsonJsonParseException_initWithNSString_(NSString *msg) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT void ComGoogleGsonJsonParseException_initWithNSString_withJavaLangThrowable_(ComGoogleGsonJsonParseException *self, NSString *msg, JavaLangThrowable *cause);

FOUNDATION_EXPORT ComGoogleGsonJsonParseException *new_ComGoogleGsonJsonParseException_initWithNSString_withJavaLangThrowable_(NSString *msg, JavaLangThrowable *cause) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT void ComGoogleGsonJsonParseException_initWithJavaLangThrowable_(ComGoogleGsonJsonParseException *self, JavaLangThrowable *cause);

FOUNDATION_EXPORT ComGoogleGsonJsonParseException *new_ComGoogleGsonJsonParseException_initWithJavaLangThrowable_(JavaLangThrowable *cause) NS_RETURNS_RETAINED;

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleGsonJsonParseException)

#endif // _JsonParseException_H_
