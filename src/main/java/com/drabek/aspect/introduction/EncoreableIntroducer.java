package com.drabek.aspect.introduction;

import com.drabek.aspect.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.drabek.aspect.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
