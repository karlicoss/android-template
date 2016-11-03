package com.github.karlicoss.template;

import android.app.Activity;

import org.checkerframework.checker.fenum.qual.Fenum;
import org.checkerframework.checker.fenum.qual.FenumTop;
import org.checkerframework.example.FolderId;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class MainActivity extends Activity {

    @SuppressWarnings("fenum:return.type.incompatible")
    public @FolderId long getInboxFid() {
        return 1L; // TODO actual DB query
    }

    public long getMessagesCount(@FolderId long folderId) {
        return 1; // TODO actual messages count
    }

    public void test() {
        System.err.println(getMessagesCount(1));
        System.err.println(getMessagesCount(getInboxFid()));
    }

//
//    public class TestStatic {
//        public static final @Fenum("A") int ACONST1 = 1;
//        public static final @Fenum("A") int ACONST2 = 2;
//
//        public static final @Fenum("B") int BCONST1 = 4;
//        public static final @Fenum("B") int BCONST2 = 5;
//    }
//
//    static class FenumUser {
//        @Fenum("A") int state1 = TestStatic.ACONST1;     // ok
//        @Fenum("B") int state2 = TestStatic.ACONST1;     // Incompatible fenums forbidden!
//
//        void fenumArg(@Fenum("A") int p) {}
//
//        void foo() {
//            state1 = 4;                     // Direct use of value forbidden!
//            state1 = TestStatic.BCONST1;    // Incompatible fenums forbidden!
//            state1 = TestStatic.ACONST2;    // ok
//
//            fenumArg(5);                    // Direct use of value forbidden!
//            fenumArg(TestStatic.BCONST1);   // Incompatible fenums forbidden!
//            fenumArg(TestStatic.ACONST1);   // ok
//        }
//    }
}
