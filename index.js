
let moment = require('moment')
let express = require('express')
let app = express()
let port = 48085

console.log("starting")


app.get('/', (req, res) => {
    res.send('Date is:', moment().toString())
})

app.listen(port, '0.0.0.0', () => {
    console.log(`Test server is running`)
})