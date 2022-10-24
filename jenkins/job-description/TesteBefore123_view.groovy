 
listView('TesteBefore123 Jobs') {
    description('TesteBefore123 Jobs')
    jobs {
        regex('TesteBefore123_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
