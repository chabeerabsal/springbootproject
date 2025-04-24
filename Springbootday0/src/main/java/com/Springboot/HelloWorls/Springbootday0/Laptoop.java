package com.Springboot.HelloWorls.Springbootday0;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptoop implements Computer{
    @Override
    public void  compile()
    {

        System.out.println("Compiling using laptop");
    }
}
