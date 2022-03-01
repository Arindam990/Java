




class StringBufferExample{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
      // insert particular position
        sb.insert(1,"Java");
        System.out.println(sb);
       // replace
        sb.replace(1,3,"Java");
        System.out.println(sb);
        //Delete
        sb.delete(1,3);
        System.out.println(sb);
        // reverse string
        sb.reverse();
        System.out.println(sb);

        //The capacity() method of the StringBuffer class returns the current capacity of the buffer.
        // The default capacity of the buffer is 16. If the number of character increases from its current capacity,
        // it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34
        System.out.println(sb.capacity());

        //The ensureCapacity() method of the StringBuffer class ensures that the given capacity is the minimum to the current capacity.
        // If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2.
        // For example if your current capacity is 16, it will be (16*2)+2=34.

        sb.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb.capacity());//now 70



    }
}
