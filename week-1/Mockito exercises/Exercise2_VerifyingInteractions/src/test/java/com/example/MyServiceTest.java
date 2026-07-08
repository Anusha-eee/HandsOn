package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class MyServiceTest {
    @Mock
    private ExternalApi mockApi;
    @InjectMocks
    private MyService myService;
    @Test
    public void testVerifyingInteractions() {
        myService.fetchData();
        verify(mockApi, times(1)).getData();
    }
}
