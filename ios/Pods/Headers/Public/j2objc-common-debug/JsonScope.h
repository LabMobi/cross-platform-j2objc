//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: jar:file:/Users/lauris/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.3.1/563dcb685903c96ce8abbd03adf7fa49e19aa8b4/gson-2.3.1-sources.jar!com/google/gson/stream/JsonScope.java
//

#ifndef _JsonScope_H_
#define _JsonScope_H_

#include "J2ObjC_header.h"

#define ComGoogleGsonStreamJsonScope_EMPTY_ARRAY 1
#define ComGoogleGsonStreamJsonScope_NONEMPTY_ARRAY 2
#define ComGoogleGsonStreamJsonScope_EMPTY_OBJECT 3
#define ComGoogleGsonStreamJsonScope_DANGLING_NAME 4
#define ComGoogleGsonStreamJsonScope_NONEMPTY_OBJECT 5
#define ComGoogleGsonStreamJsonScope_EMPTY_DOCUMENT 6
#define ComGoogleGsonStreamJsonScope_NONEMPTY_DOCUMENT 7
#define ComGoogleGsonStreamJsonScope_CLOSED 8

@interface ComGoogleGsonStreamJsonScope : NSObject

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleGsonStreamJsonScope)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, EMPTY_ARRAY, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, NONEMPTY_ARRAY, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, EMPTY_OBJECT, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, DANGLING_NAME, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, NONEMPTY_OBJECT, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, EMPTY_DOCUMENT, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, NONEMPTY_DOCUMENT, jint)

J2OBJC_STATIC_FIELD_GETTER(ComGoogleGsonStreamJsonScope, CLOSED, jint)

FOUNDATION_EXPORT void ComGoogleGsonStreamJsonScope_init(ComGoogleGsonStreamJsonScope *self);

FOUNDATION_EXPORT ComGoogleGsonStreamJsonScope *new_ComGoogleGsonStreamJsonScope_init() NS_RETURNS_RETAINED;

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleGsonStreamJsonScope)

#endif // _JsonScope_H_
