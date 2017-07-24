package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Created by darrenrose on 24/07/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    private Instant created = Instant.now();
    private Instant modified;
}
