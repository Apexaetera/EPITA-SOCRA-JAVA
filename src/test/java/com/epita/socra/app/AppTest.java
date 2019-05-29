package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    /*@Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        App app = new App(mock);
        app.run();

        verify(mock).write("Hello, what's your name ?");
        verify(mock).write(argThat(message -> message.contains("TEST")));

    }*/
    public void create_test(String in, String out){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn(in).thenReturn("exit");
        App app = new App(mock);
        app.run();

        verify(mock).write(argThat(message -> message.contains(out)));
    }

    @Test
    public void test_0_un()
    {
        create_test("_ _ _ _ _", "0");
    }

    @Test
    public void test_1_un()
    {
        create_test(". _ _ _ _", "1");
    }
    @Test
    public void test_2_un()
    {
        create_test(". . _ _ _", "2");
    }
    @Test
    public void test_3_un()
    {
        create_test(". . . _ _", "3");
    }
    @Test
    public void test_4_un()
    {
        create_test(". . . . _", "4");
    }
    @Test
    public void test_5_un()
    {
        create_test(". . . . .", "5");
    }
    @Test
    public void test_6_un()
    {
        create_test("_ . . . .", "6");
    }
    @Test
    public void test_7_un()
    {
        create_test("_ _ . . .", "7");
    }
    @Test
    public void test_8_un()
    {
        create_test("_ _ _ . .", "8");
    }
    @Test
    public void test_9_un()
    {
        create_test("_ _ _ _ .", "9");
    }

    @Test
    public void test_76_un() {
        create_test("_ _ . . . _ . . . .", "76");
    }
    @Test
    public void test_06_un() {
        create_test("_ _ _ _ _ _ . . . .", "6");
    }

    @Test
    public void test_valid_1(){
        create_test("1", "1");
    }
    @Test
    public void test_valid_2(){
        create_test("2", "2");
    }
    @Test
    public void test_valid_3(){
        create_test("3", "3");
    }
    @Test
    public void test_valid_4(){
        create_test("4", "4");
    }
    @Test
    public void test_valid_5(){
        create_test("5", "5");
    }
    @Test
    public void test_valid_6(){
        create_test("6", "6");
    }
    @Test
    public void test_valid_7(){
        create_test("7", "7");
    }
    @Test
    public void test_valid_8(){
        create_test("8", "8");
    }

    @Test
    public void test_valid_9(){
        create_test("9", "9");
    }

    @Test
    public void test_valid_10(){
        create_test("10", "10");
    }
    @Test
    public void test_valid_83(){
        create_test("83", "83");
    }
    @Test
    public void test_valid_1903(){
        create_test("1903", "1903");
    }
    @Test
    public void test_valid_42(){
        create_test("42", "42");
    }
    @Test
    public void test_valid_999(){
        create_test("999", "999");
    }

    @Test
    public void test_valid_420(){
        create_test("420", "420");
    }
    @Test
    public void test_valid_69(){
        create_test("69", "69");
    }

    @Test
    public void test_valid_0(){
        create_test("0", "0");
    }

    @Test
    public void test_valid_06(){
        create_test("06", "6");
    }

    @Test
    public void test_valid_999999999(){
        create_test("999999999", "999999999");
    }
}
