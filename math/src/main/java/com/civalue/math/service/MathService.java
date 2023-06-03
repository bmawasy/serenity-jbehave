package com.civalue.math.service;

import com.civalue.math.api.MathApi;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Bader Mawasy
 */
@Service
public class MathService implements MathApi {

    private final AtomicLong result = new AtomicLong(0);

    @Override
    public long get() {
        return result.get();
    }

    @Override
    public long multiply(long x) {
        synchronized (result) {
            result.set(result.get() * x);
            return result.get();
        }
    }
    @Override
    public long add(long x) {
        synchronized (result) {
            result.getAndAdd(x);
            return result.get();
        }
    }

    @Override
    public long subtract(long x) {
        synchronized (result) {
            result.getAndAdd(-1 * x);
            return result.get();
        }
    }

    @Override
    public long divide(long x) {
        synchronized (result) {
            result.set(result.get() / x);
            return result.get();
        }
    }

    @Override
    public void set(long x){
        synchronized (result) {
            result.set(x);
        }
    }

}
