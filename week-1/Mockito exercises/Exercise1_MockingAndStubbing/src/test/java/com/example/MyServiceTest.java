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
    public void testMockingAndStubbing() {
        when(mockApi.getData()).thenReturn("Stubbed Response");
        String response = myService.fetchData();
        assertEquals("Stubbed Response", response);
    }
}
