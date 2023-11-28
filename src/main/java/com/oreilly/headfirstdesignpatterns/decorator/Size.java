package com.oreilly.headfirstdesignpatterns.decorator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Size {

    TALL(0.5),
    GRANDE(0.10),
    VENTI(0.15);

    private final double upcharge;
}
