package mp

impl class SubClassHeaderDelegatedTo : CommonClassDelegatingToSubClassHeader() {
    impl override fun doIt() {
        println("Delegated to a Java sub class")
    }
}